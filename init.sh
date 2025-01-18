echo "正在启动 MyQSL……"
mysqld_safe &
echo "首次构建项目……"
mvn clean install 
echo "首次启动项目……"
mvn spring-boot:run

