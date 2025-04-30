package ii.fundamentos.casting;

import java.util.Arrays;

public class Casting {
    public static void main(String[] args) {
        /**
         * Casting implícito, fazendo a conversão automática de int para double
         */
        int numeroInt = 10;
        double numeroDouble = numeroInt;

        System.out.println("Número inteiro: " + numeroInt);
        System.out.println("Número double: " + numeroDouble);

        /**
         * Casting explícito, fazendo a conversão manualmente
         */
        double numberDouble = 9.78;
        int numberInt = (int) numberDouble;

        System.out.println("Número double: " + numberDouble);
        System.out.println("Número inteiro: " + numberInt); // saída: 9, truncando a parte decimal

        /**
         * Casting de inteiro para String.
         * Podemos utilizar a classe Integer e seu método .toString(), ou o método String.valueOf(),
         * que também converte o número para String.
         */
        int numeroInteiro = 10;
        String numeroInteiroParaString = Integer.toString(numeroInteiro); // Usando Integer.toString()
        String numeroInteiroParaString2 = String.valueOf(numeroInteiro); // Alternativa usando String.valueOf()

        // System.out.println(numeroInteiroParaString); // Saída: "10"
        // System.out.println(numeroInteiroParaString2); // Saída: "10"

        System.out.println("Número inteiro para String: " + numeroInteiroParaString);

        /**
         * Casting de String para inteiro.
         * Assim como no exemplo acima, podemos utilizar a classe Integer e seu método .parseInt() ou .valueOf(),
         * para converter String para inteiro.
         */
        String numeroString = "123456";
        int numeroInteger = Integer.parseInt(numeroString);
        int numeroInteger2 = Integer.valueOf(numeroString);

        System.out.println("String para número inteiro (parseInt()): " + numeroInteger);
        System.out.println("String para número inteiro (valueOf()): " + numeroInteger2);

        /**
         * Casting em operações matemáticas.
         *
         * Quando dividimos dois números inteiros em Java, o resultado também será um número inteiro.
         * Para obter um resultado com casas decimais, devemos converter pelo menos um dos valores para double.
         */
        int a = 5;
        int b = 2;

        double resultado = (double) a / b;
        System.out.println("Resultado da divisão com casting: " + resultado);
        System.out.println("Resultado da divisão sem casting (números inteiros): " + a / b);

        /**
         * Casting entre tipos de caracteres.
         *
         * Caracteres (`char`) são internamente armazenados como valores numéricos baseados na tabela ASCII ou Unicode.
         * Assim, podemos convertê-los diretamente para `int` e obter seu valor correspondente.
         * Exemplo: 'A' → 65, 'B' → 66, 'C' → 67.
         */
        char letra = 'A';
        int codigoAscii = (int) letra;

        System.out.println("Letra: " + letra);
        System.out.println("Código ASCII da letra: " + codigoAscii);

        /**
         * Casting com array de double para int
         */
        double[] numerosDouble = {1.9, 2.5, 3.7, 4.2, 5.8}; // Array de double
        int[] numerosInt = new int[numerosDouble.length]; // Criando um array de int com o mesmo tamanho

        System.out.println("Array double: " + Arrays.toString(numerosDouble));
        System.out.println("Array int antes da conversão: " + Arrays.toString(numerosInt)); // [0, 0, 0, 0, 0]

        /**
         * Convertendo cada número de double para int, fazendo um casting explícito e truncando os valores (removendo a parte decimal de um número)
         * Cada valor convertido para int, está sendo armazenado em uma posição do array de inteiros
         */
        for (int i = 0; i < numerosDouble.length; i++) {
            numerosInt[i] = (int) numerosDouble[i];
        }

        System.out.println("Array int atualizado: " + Arrays.toString(numerosInt));
    }
}
