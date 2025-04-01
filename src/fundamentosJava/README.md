# 🏗️ Fundamentos do Java

Esta seção contém conceitos básicos sobre a estrutura de um programa Java, incluindo o método `main`, pacotes (`package`) e importação de classes (`import`).

---

## 📌 Estrutura Básica de um Programa Java

Todo programa Java precisa de **uma classe principal** contendo o método `main`, que é o ponto de entrada do programa.

### 🔹 Exemplo de um código Java mínimo:
```java
public class MeuPrograma {
    public static void main(String[] args) {
        System.out.println("Olá, Java!");
    }
}
```

---

## 🏷️ O que significa `public static void main(String[] args)`?

| Palavra-chave | Explicação |
|--------------|-----------|
| `public` | Torna o método acessível a qualquer parte do código. |
| `static` | Permite chamar o método sem precisar criar um objeto da classe. |
| `void` | Indica que o método **não retorna** um valor. |
| `main` | Nome obrigatório do método principal, chamado pela JVM. |
| `String[] args` | Representa os argumentos passados pela linha de comando. |

### 🔹 Exemplo com argumentos na execução:
```java
public class Argumentos {
    public static void main(String[] args) {
        System.out.println("Primeiro argumento: " + args[0]);
    }
}
```
💡 **Se executarmos `java Argumentos Olá`, a saída será:**
```
Primeiro argumento: Olá
```

---

## 📦 O que são `package` e `import`?

### 🔹 **`package` - Organização de Classes**
Um **package** (pacote) é um agrupamento de classes relacionadas. Ele ajuda a organizar o código.

#### 📝 Exemplo de uso de `package`:
```java
package fundamentosJava;

public class EstruturaBasica {
    public static void main(String[] args) {
        System.out.println("Este código pertence ao pacote fundamentosJava");
    }
}
```
💡 O arquivo deve estar dentro de **src/fundamentosJava/** para que funcione corretamente.

---

### 🔹 **`import` - Como importar classes de outros pacotes?**
Se quisermos **usar uma classe de outro pacote**, precisamos **importá-la**.

#### 📝 Exemplo: Importando uma classe de outro pacote

```java
package fundamentosJava;

import fundamentosJava.tiposPrimitivos.TiposPrimitivos; // Importando uma classe de outro pacote

public class TesteImport {
    public static void main(String[] args) {
        TiposPrimitivos exemplo = new TiposPrimitivos();
        exemplo.mostrarExemplo();
    }
}
```
---

## 🎯 **Resumo**
✔ Todo programa Java **precisa do método `main`**.  
✔ O `package` ajuda a **organizar classes** em diretórios separados.  
✔ O `import` permite **reutilizar código** de outros pacotes.

🚀 Agora que entendemos esses fundamentos, podemos explorar conceitos mais avançados!

---

### 📂 **Estrutura do Projeto com a Nova Pasta**
Seus arquivos ficariam assim:

```
learning-java/
│── src/
│   ├── fundamentosJava/       ✅ (Nova pasta)
│   │   ├── README.md          ✅ (Explicação sobre conceitos básicos)
│   │   ├── EstruturaBasica.java
│   │   ├── TesteImport.java
│   ├── fundamentosJava.tiposPrimitivos/
│   ├── operadoresAritmeticos/
│
│── README.md  ✅ (Guia geral do projeto)
│── .gitignore
```