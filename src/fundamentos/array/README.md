# Principais conceitos sobre arrays

- **Definição**: Um array é uma coleção de elementos do mesmo tipo, organizados numa sequência contínua na memória. Cada
  elementos é acessado por um índice
- **Índices**: Os elementos de um array são acessados por meio de índices numéricos, que começam em 0. Por exemplo, o
  primeiro elemento de um array está na posição 0.
- **Tamanho fixo**: O tamanho de um array é definido no momento da sua criação e não pode ser alterado. Uma vez que o
  array é inicializado, não é possível adicionar ou remover elementos.
- **Tipos de dados**: Arrays podem armazenar qualquer tipo de dado, incluindo tipos primitivos (como `int`, `double`) e
  objetos (como `String` ou classes personalizadas).
- **Multidimensionais**: Java permite a criação de arrays multidimensionais, como matrizes (arrays de arrays). Isso
  serve para representar dados em múltiplas dimensões, como uma tabela ou grade.

---

# Vantagens e Limitações

- Vantagens: Arrays oferecem acesso rápido aos elementos e são eficientes em termos de memória quando o número de
  elementos é conhecimento previamente.
- Limitações: O tamanho dos arrays é fixo e não pode ser alterado após a sua criação. Para manipulação dinâmica de
  coleções de dados, outras estruturas como `ArrayList` podem ser mais adequadas.

# Introdução ao Garbage Collection

Garbage Collection (GC) é o processo automático de gerenciamento de memória, onde objetos que não estão mais em uso, são 
removidos da memória. Isso ajuda a evitar vazamentos de memória.

O Garbage Collector monitora objetos que não têm mais referências ativas e os limpa da memória.

```java
 // Exemplo de objeto não mais referenciado:
MinhaClasse obj = new MinhaClasse();
obj = null;  // O objeto anterior é agora elegível para GC
```

O Garbage Collection é especialmente importante em linguagens como Java e C#, onde a memória é gerenciada automaticamente.

# Links Úteis
- [Tutorial oficial de Arrays em Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Guia sobre Arrays no Baeldung](https://www.baeldung.com/java-arrays-guide)
- [Artigo sobre Arrays no GeeksforGeeks](https://www.geeksforgeeks.org/arrays-in-java/?ref=lbp)
- [W3Schools - Arrays em Java](https://www.w3schools.com/java/java_arrays.asp)
- [GeeksforGeeks - Garbage Collection em Java](https://www.geeksforgeeks.org/java/garbage-collection-in-java/)