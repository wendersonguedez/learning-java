package fundamentosJava.casting;

import java.util.Arrays;

public class Casting {
    public static void main(String[] args) {
        /**
         * Casting implítico, fazendo a conversão automatica de int para double
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
         * Casting de inteiro para string
         *
         * 10 ==> '10'
         */
        Integer numeroInteiro = 10;
        String numeroInteiroParaString = numeroInteiro.toString();

        System.out.println("Número inteiro para String: " + numeroInteiroParaString);

        /**
         * Casting em operações matemáticas
         */
        int a = 5;
        int b = 2;

        double resultado = (double) a / b;
        System.out.println("Resultado da divisão com casting: " + resultado);
        System.out.println("Resultado da divisão sem casting (números inteiros): " + a / b);

        /**
         * Casting entre tipos de caracteres.
         *
         * Também é possível converter entre char e int, pois os caracteres possuem um valor numérico na tabela ASCII.
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
        System.out.println("Array int: " + Arrays.toString(numerosInt)); // [0, 0, 0, 0, 0]

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
