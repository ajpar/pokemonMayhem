echo off
cls
echo yo
set path ="C:\Program Files\Java\jdk1.8.0_31\bin"
ECHO  STARX INC
ECHO  THIS IS FOR  Pokemon game by SANDEEP(Sylveryte)
:starx
cls
ECHO/compiling Pokemon/
javac Pokemon.java
echo /compilation ends/
pause
echo /compiling Engine/
javac Engine.java
echo /compilation ends/
pause
pause
goto starx
exit
