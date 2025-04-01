# 🎯 Casting (Conversão de Tipos) 🎭

Casting, ou conversão de tipos, é o processo de transformar um 
valor de um tipo de dado para outro. Em Java, esse processo pode ocorrer de
duas formas: conversão implícita (automática) e conversão explícita (manual).

---

## 🔄 Conversão Implícita (Widening Casting) ✅
A conversão implícita ocorre automaticamente quando um valor de um tipo menor (menos preciso) é atribuído a um tipo maior (mais preciso). Isso é possível porque não há risco de perda de dados.

```java
int numeroInteiro = 10;   // Tipo menor (int)
double numeroDecimal = numeroInteiro; // Conversão implícita para double

System.out.println(numeroDecimal); // Saída: 10.0
```
✅ Aqui, o valor do tipo int é convertido automaticamente para double, pois double tem maior capacidade de armazenamento.

---

## ⚠️ Conversão Explícita (Narrowing Casting) ✂️
A conversão explícita ocorre quando tentamos converter um tipo maior 
para um tipo menor, o que pode levar à perda de precisão. Nesse caso, 
precisamos indicar a conversão manualmente, usando casting.

```java
double valorDecimal = 10.5; // Tipo maior (double)
int valorInteiro = (int) valorDecimal; // Conversão explícita para int

System.out.println(valorInteiro); // Saída: 10
```
⚠️ Aqui, o valor 10.5 foi truncado para 10, pois a parte decimal foi removida na conversão para int.
