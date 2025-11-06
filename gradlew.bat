@echo off
SETLOCAL
SET DIRNAME=%~dp0
IF "%DIRNAME%"=="" SET DIRNAME=.
SET CLASSPATH=%DIRNAME%gradle\wrapper\gradle-wrapper.jar
SET JAVA_EXE=%JAVA_HOME%\bin\java.exe
