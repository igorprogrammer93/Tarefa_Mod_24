﻿# Tarefa_Mod_24


# Compila todos os .java do src
javac -d bin src/interfaces/*.java src/dao/*.java src/mocks/*.java src/service/*.java


# Compila os testes (com acesso ao que está em bin)
javac -cp bin -d bin tests/*.java


Executar os tests java -cp bin tests.AllTests
