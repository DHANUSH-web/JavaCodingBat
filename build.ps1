$ErrorActionPreference = 'Stop'
Set-Location -LiteralPath $PSScriptRoot

function Invoke-Build {
    $sources = Get-ChildItem -Path 'src' -Filter '*.java' -File -Recurse
    if ($sources.Count -eq 0) {
        throw 'Build failed: no Java source files found in src.'
    }

    New-Item -ItemType Directory -Path 'out' -Force | Out-Null
    & javac -d 'out' @($sources.FullName)
    if ($LASTEXITCODE -ne 0) {
        throw 'Build failed.'
    }
}

function Invoke-Run {
    Invoke-Build
    & java -cp 'out' 'Main'
    if ($LASTEXITCODE -ne 0) {
        throw 'Run failed.'
    }
}

function Invoke-Tests {
    Invoke-Build

    $testSources = Get-ChildItem -Path 'test' -Filter '*.java' -File -Recurse
    if ($testSources.Count -eq 0) {
        throw 'Test failed: no Java test files found in test.'
    }

    New-Item -ItemType Directory -Path 'out-test' -Force | Out-Null
    & javac -cp 'out;lib/*' -d 'out-test' @($testSources.FullName)
    if ($LASTEXITCODE -ne 0) {
        throw 'Test failed: test compilation failed.'
    }

    & java -jar 'lib/junit-platform-console-standalone-1.10.0.jar' `
        execute -cp 'out;out-test' --scan-class-path
    if ($LASTEXITCODE -ne 0) {
        throw 'Test failed.'
    }
}

function Clear-BuildOutputs {
    $outputs = @('out', 'out-test') | Where-Object { Test-Path -LiteralPath $_ }
    if ($outputs.Count -eq 0) {
        Write-Output 'Nothing to clean.'
        return
    }

    $outputs | ForEach-Object { Remove-Item -LiteralPath $_ -Recurse -Force }
    Write-Output 'Build outputs removed.'
}

if ($args.Count -ne 1) {
    Write-Error 'Allowed commands: .\build.ps1 [build | run | test | clean]'
    exit 1
}

try {
    switch ($args[0].ToLowerInvariant()) {
        'build' {
            Invoke-Build
            Write-Output 'Build complete.'
        }
        'run' {
            Write-Output '========= STARTED ========='
            Invoke-Run
            Write-Output '========= FINISHED ========='
        }
        'test' {
            Write-Output '========= STARTED ========='
            Invoke-Tests
            Write-Output '========= FINISHED ========='
        }
        'clean' { Clear-BuildOutputs }
        default {
            Write-Error 'Allowed commands: .\build.ps1 [build | run | test | clean]'
            exit 1
        }
    }
}
catch {
    Write-Error $_.Exception.Message
    exit 1
}
