@echo off
setlocal enabledelayedexpansion

:: Git statusdan o'zgargan fayllarni olish
for /f "tokens=2 delims= " %%a in ('git status --porcelain') do (
    set "file=%%a"
    goto :commit
)

echo No new files found.
exit /b

:commit
git add .
git commit -m "add %file%"
git push
