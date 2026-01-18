#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
ANTLR_JAR="$(ls "$ROOT_DIR/tools"/antlr-*-complete.jar 2>/dev/null | sort -V | tail -1 || true)"
GEN_DIR="$ROOT_DIR/gen/java"

INPUT_FILE="${1:-}"
if [[ -z "$INPUT_FILE" ]]; then
  echo "Usage: $0 <path-to-input.bn>" >&2
  exit 2
fi

if [[ -z "${ANTLR_JAR}" || ! -f "$ANTLR_JAR" ]]; then
  echo "Missing ANTLR jar in: $ROOT_DIR/tools/" >&2
  echo "Run: ./scripts/gen-java.sh (after placing the jar into tools/)" >&2
  exit 2
fi

if [[ ! -d "$GEN_DIR" ]]; then
  echo "Missing generated sources: $GEN_DIR" >&2
  echo "Run: ./scripts/gen-java.sh" >&2
  exit 2
fi

TMP_CLASSES="$ROOT_DIR/gen/.classes"
mkdir -p "$TMP_CLASSES"

find "$GEN_DIR" -name "*.java" > "$ROOT_DIR/gen/.sources.txt"

javac -cp "$ANTLR_JAR" -d "$TMP_CLASSES" @"$ROOT_DIR/gen/.sources.txt"

# TestRig prints syntax errors to stderr by default.
# We intentionally avoid -tree/-tokens to keep output "errors only".
java -cp "$ANTLR_JAR:$TMP_CLASSES" \
  org.antlr.v4.gui.TestRig \
  BNLang program \
  "$INPUT_FILE"

