$ mkdir rhymes

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy
$ cd rhymes

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes
$ git init
Initialized empty Git repository in C:/xampp/htdocs/praxis-academy/rhymes/.git/

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes (master)
$ touch README.txt

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes (master)
$ git add README.txt

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes (master)
$ git commit -m 'First commit.'
[master (root-commit) 07351d0] First commit.
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.txt

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes (master)
$ echo 'This repo is collection of my favorite nursery rhymes.' >> README.txt

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   README.txt

no changes added to commit (use "git add" and/or "git commit -a")

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes (master)
$ git diff
warning: LF will be replaced by CRLF in README.txt.
The file will have its original line endings in your working directory.
diff --git a/README.txt b/README.txt
index e69de29..f4a593c 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+This repo is collection of my favorite nursery rhymes.

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes (master)
$ git add README.txt
warning: LF will be replaced by CRLF in README.txt.
The file will have its original line endings in your working directory.

Eko@DESKTOP-V0NPA3V MINGW64 /c/xampp/htdocs/praxis-academy/rhymes (master)
$ git commit -m 'Added project overview to README.txt'
[master 186e0c4] Added project overview to README.txt
 1 file changed, 1 insertion(+)
