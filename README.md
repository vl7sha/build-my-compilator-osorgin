# BNLang (ANTLR grammar)

Этот репозиторий содержит ANTLR-грамматику `BNLang.g4` по спецификации из `БН.md` (вариант 58 / 341111) и набор примеров в `examples/`.

## Что важно

- Комментарии поддерживаются в виде `{ ... }` и **пропускаются** лексером.
- Десятичные целые допускаются **как с суффиксом `D/d`, так и без него** (например `123` и `123D`).

## Быстрый запуск (Java target)

1) Скачайте ANTLR jar (например `antlr-4.13.2-complete.jar`) и положите его в `tools/`:

- `tools/antlr-4.13.2-complete.jar` (или любая `tools/antlr-4.13.x-complete.jar`)

2) Сгенерируйте парсер/лексер:

```bash
./scripts/gen-java.sh
```

3) Прогоните пример (parse tree):

```bash
./scripts/test-java.sh examples/01_numbers.bn
```

4) Прогоните пример (только ошибки):

```bash
./scripts/check-java.sh examples/01_numbers.bn
```

Можно подставлять любой файл из `examples/`.

