#!/bin/zsh

set -euo pipefail

if [[ $# -lt 1 ]]; then
    echo "Usage: ./run-java.sh <FileName.java|ClassName>"
    exit 1
fi

target="$1"

if [[ "$target" != *.java ]]; then
    target="${target}.java"
fi

if [[ ! -f "$target" ]]; then
    echo "File not found: $target"
    exit 1
fi

# Java source-file mode compiles and runs the file in one step.
java "$target"
