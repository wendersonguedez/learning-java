package fundamentos.estruturasDeRepeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // ate5();
        // usandoBreakContinue();
        // percorrendoMatriz();
        // tabuada();
        piramideNumerica();
    }

    public static void ate5() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i: " + i);
        }
    }

    public static void usandoBreakContinue() {
        for (int i = 0; i <= 20; i++) {
            if (i == 5) {
                System.out.println("parando o loop na iteração 5 (break)");
                break;
            }
            if (i % 2 == 0) {
                continue; // Pula números pares.
            }
            System.out.println("Número ímpar: " + i);
        }
    }

    public static void percorrendoMatriz() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        /**
         * 1 for - linhas
         * 2 for - colunas
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tabuada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int numeroMultiplicado = (numero * i);
            System.out.println(numero + "x" + i + " = " + numeroMultiplicado);
        }
    }

    public static void piramideNumerica() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas da pirâmide: ");
        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
