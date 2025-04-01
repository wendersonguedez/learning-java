## 🔢 Tipos Primitivos em Java

Java possui **oito tipos primitivos** de dados, divididos em **números inteiros**, **números decimais**, **caracteres** e **valores booleanos**.

### 📌 **1. Números Inteiros**
São utilizados para armazenar números sem casas decimais.

| Tipo  | Tamanho | Faixa de Valores |
|--------|---------|----------------|
| `byte` | 8 bits | -128 a 127 |
| `short` | 16 bits | -32.768 a 32.767 |
| `int` | 32 bits | -2.147.483.648 a 2.147.483.647 |
| `long` | 64 bits | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 |

#### 🔹 **Exemplo:**
```java
byte b = 100;        // Valor válido
short s = 1000;      // Valor válido
int i = 1000000;     // Valor válido
long l = 10000000L;  // Necessário 'L' no final para indicar um long
```

### 📌 **2. Números Decimais**
São utilizados para armazenar valores que possuem casas decimais.

| Tipo  | Tamanho | Precisão |
|--------|---------|----------|
| `float` | 32 bits | Precisão simples |
| `double` | 64 bits | Precisão dupla |

#### 🔹 **Exemplo:**
```java
float f = 10.5f;    // Necessário 'f' no final para indicar um float
double d = 20.5;    // Padrão para números decimais
```

---

### 📌 **3. Caracteres**
Usado para armazenar um único caractere.

| Tipo  | Tamanho | Exemplo |
|--------|---------|----------|
| `char` | 16 bits | `'A'`, `'b'`, `'9'` |

#### 🔹 **Exemplo:**
```java
char c = 'a'; // Apenas um caractere entre aspas simples
```

---

### 📌 **4. Cadeias de Caracteres (String)**
O tipo `String` **não é um tipo primitivo**, mas é muito utilizado para armazenar textos.

#### 🔹 **Exemplo:**
```java
String myName = "wend";
```

---

### 📌 **5. Valores Booleanos**
Armazena valores `true` ou `false`.

| Tipo  | Tamanho | Valores Possíveis |
|--------|---------|-----------------|
| `boolean` | 1 bit | `true`, `false` |

#### 🔹 **Exemplo:**
```java
boolean bool = true;
```

---

## 🎯 Código Completo de Exemplo

```java
public class Main {
    public static void main(String[] args) {
        byte b = 100;
        short s = 1000;
        int i = 1000000;
        long l = 10000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'a';
        String myName = "wend";
        boolean bool = true;

        // outra alternativa => 'myName.indexOf(c) != -1' => caso o caractere não for encontrado, ele retorna -1
        // ou seja, se for diferente de -1, é porque ele foi encontrado na String
        if (!myName.isBlank() && myName.contains(String.valueOf(c))) {
            System.out.println("oi");
        } else {
            System.out.print("oi²");
        }
    }
}

```