echo off & color 0A

set DIR="%cd%"
echo DIR=%DIR%

setlocal enabledelayedexpansion
for /r %%i in (*.proto) do (
	set s=%%i
	set s=!s:%~dp0=!
	protoc_2.5.exe --java_out=D:\Work\CardGame\Protocol\protobuf\gen  !s!
)
@pause