# Iterator

## O que é o padrão Iterator?

O **Iterator** é um padrão de projeto usado para **percorrer os elementos de uma coleção sem precisar conhecer como ela está estruturada internamente**.

Ele permite acessar os elementos **um por vez**, normalmente usando operações como `hasNext()` e `next()`. Assim, a forma de percorrer a coleção fica separada da própria coleção.

É útil principalmente quando:
- A coleção possui uma estrutura interna mais complexa.
- É necessário ter diferentes formas de percorrer os elementos.
- Queremos esconder a estrutura interna da coleção.
- Precisamos controlar a travessia sem expor como os dados estão organizados.

---

## Exercício 1: Aplicações

### 1. Playlist com diferentes formas de reprodução

**Faz sentido usar Iterator.**

A playlist precisa ser percorrida de diferentes maneiras, como sequencial, embaralhada ou apenas com músicas favoritas. O Iterator permite criar diferentes formas de percorrer a coleção sem que o restante do sistema precise conhecer sua estrutura interna.

---

### 2. Explorador de arquivos com pastas e arquivos

**Faz sentido usar Iterator.**

Uma árvore de arquivos possui uma estrutura mais complexa, com pastas dentro de outras pastas e arquivos. O Iterator pode esconder essa estrutura e permitir que o sistema percorra os arquivos e pastas sem precisar saber como os nós estão ligados.

---

### 3. Arquivo gigante lido por partes

**Faz sentido usar Iterator.**

O Iterator permite entregar um registro por vez, evitando carregar todo o arquivo na memória. Isso é especialmente útil em arquivos muito grandes ou sistemas que trabalham com **streaming**, pois os dados podem ser processados aos poucos.

---

### 4. Array fixo percorrido por um único `for`

**Não faz sentido usar Iterator.**

Nesse caso, a estrutura é simples, o tamanho é conhecido e existe apenas uma travessia feita dentro da própria classe. Criar um Iterator seria desnecessário e poderia deixar o código mais complexo sem trazer um benefício real, sendo um caso de **overengineering**.

---

### 5. `ResultSet` do banco de dados

**Faz sentido usar Iterator.**

O `ResultSet` já possui uma grande quantidade de registros que normalmente são processados um por vez. Um Iterator pode esconder o funcionamento do cursor e permitir que o sistema percorra os resultados sem precisar conhecer detalhes da estrutura do banco de dados.

---

## Resumo

| Cenário | Usar Iterator? | Motivo |
|---|---|---|
| Playlist com várias ordens | **Sim** | Permite diferentes formas de travessia |
| Árvore de arquivos | **Sim** | Esconde a estrutura complexa da árvore |
| Arquivo gigante | **Sim** | Permite processar os dados um por vez |
| Array simples e fixo | **Não** | Iterator seria desnecessário |
| `ResultSet` do banco | **Sim** | Esconde o cursor e percorre os registros um por vez |