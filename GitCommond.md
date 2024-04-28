# Git命令练习

代码操作：
1、Git添加代码
git add .

2、Git提交代码
git commit -m "description"

3、Git Push代码
git push

4、查看git帮助
git --help；git help -g

5、查看远端分支
git branch -r

6、查看本地和远端所有分支
git branch -a

7、Git删除本地提交记录(该命令会将本地所有提交记录删除，新的Commit作为开始的第一个Commit)：
git update-ref -D HEAD

分支创建：

1、本地创建分支：git checkout -b <branch-name>

2、从远程分支中创建并切换到本地分支：
git checkout -b <branch-name> origin/<branch-name>

3、重命名本地分支：git branch -m <new-branch-name>

4、删除本地分支(删除本地分支必须处于非删除分支上，如处于删除分支上无法删除)：git branch -D <branch-name>