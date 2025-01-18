#!/system/bin/sh
echo 输入提交的辅助信息：
read info
echo 连接远程仓库
git remote add springboot https://github.com/chenzezhi/springboot.git
echo 添加所有文件到暂存区……
git add .
echo 配置姓名和邮箱......
git config --global user.name "czz"
git config --global user.email "2841989426@qq.com"
echo 将文件提交到本地仓库……
git commit -m info
echo 推送到远程仓库……
git push -u springboot master
