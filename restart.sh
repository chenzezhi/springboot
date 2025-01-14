#!/bin/bash
echo "初始化……"
sh init.sh

PROJECT_DIR="/storage/emulated/0/AppProjects/demo"
BUILD_COMMAND="mvn clean package -DskipTests"
SPRINGBOOT_JAR="$PROJECT_DIR/target/demo-0.0.1-SNAPSHOT.jar"

start_springboot() {
  pkill -f "$SPRINGBOOT_JAR"
  echo "正在启动 Spring Boot 应用..."
  nohup java -jar "$SPRINGBOOT_JAR" > "$PROJECT_DIR/springboot.log" 2>&1 &
}

echo "监控代码目录的文件变化..."
inotifywait -m -r -e close_write \
  "$PROJECT_DIR/src/main/java" "$PROJECT_DIR/src/main/resources/" |
while read path action file; do
  echo "检测到文件变化：$path$file ($action)"
  
  echo "开始重新构建项目..."
  $BUILD_COMMAND
  
  echo "重启 Spring Boot 应用..."
  start_springboot
done