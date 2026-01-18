#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
ANTLR_JAR="$(ls "$ROOT_DIR/tools"/antlr-*-complete.jar 2>/dev/null | sort -V | tail -1 || true)"
GRAMMAR="$ROOT_DIR/BNLang.g4"
OUT_DIR="$ROOT_DIR/gen/java"

if [[ -z "${ANTLR_JAR}" || ! -f "$ANTLR_JAR" ]]; then
  echo "Missing ANTLR jar in: $ROOT_DIR/tools/" >&2
  echo "Expected something like: tools/antlr-4.13.x-complete.jar" >&2
  exit 2
fi

mkdir -p "$OUT_DIR"

java -jar "$ANTLR_JAR" \
  -Dlanguage=Java \
  -visitor \
  -no-listener \
  -o "$OUT_DIR" \
  "$GRAMMAR"

echo "Generated Java parser/lexer into: $OUT_DIR"

