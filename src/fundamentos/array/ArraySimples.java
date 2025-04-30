package fundamentos.array;

import java.util.Arrays;

public class ArraySimples {
    public static void main(String[] args) {
        // criandoArray();
        // iterandoArrayComFor();
        // iterandoArrayComForeach();
        //procurandoElementoNoArray();
        // mediaDeDiferentesIdades();
        menorIdade();
    }

    public static void criandoArray() {
        /**
         * Criando e inicializando um array de números inteiros com alguns valores.
         */
        int[] numeros = {10, 20, 30, 50};

        /**
         * Criando um array de strings e logo depois atribuindo alguns valores a ele,
         * o que acaba definindo o seu tamanho automaticamente.
         */
        String[] frutas;
        frutas = new String[]{"Maçã", "Morango", "Abacaxi"};

        /**
         * Criando um array de strings com tamanho definido manualmente
         * e atribuindo valores posteriormente.
         */
        String[] alunos = new String[3];
        alunos[0] = "wend";
        alunos[1] = "carlos";

        System.out.println("Array de frutas: " + Arrays.toString(frutas)); // [Maçã, Morango, Abacaxi]
        System.out.println(numeros[0]); // 10
        System.out.println(alunos[2]); // null
        System.out.println(alunos[1]); // wend
    }

    public static void iterandoArrayComFor() {
        int[] valores = {20, 321, 30923, 8312};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("valor que está na posição " + i + ": " + valores[i]);
        }
    }

    public static void iterandoArrayComForeach() {
        String[] alunos = {"wend", "bruno", "evelyn"};
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};

        /**
         * Percorrendo o array "alunos" com um loop for-each, onde
         * cada elemento é armazenado na variável "aluno" e exibido no console.
         */
        for (String aluno : alunos) {
            System.out.println("aluno: " + aluno);
        }

        for (String carro : carros) {
            System.out.println(carro);
        }
    }

    public static void procurandoElementoNoArray() {
        int[] numeros = {3, 7, 12, 19, 25};

        int numeroBuscado = 19;
        boolean encontrado = false;

        for (int numero : numeros) {
            encontrado = (numero == numeroBuscado);
            if (encontrado) {
                System.out.println("O número " + numeroBuscado + " foi encontrado");
                break;
            } else {
                System.out.println("O número ainda não foi encontrado!");
            }
        }
    }

    public static void mediaDeDiferentesIdades() {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float media, soma = 0;
        int tamanhoDoArray = ages.length;

        for (int age : ages) {
            soma += age;
        }

        media = soma / tamanhoDoArray;

        System.out.println("A média das idades é: " + media);
    }

    public static void menorIdade() {
        int[] idades = {20, 22, 18, 35, 48, 26, 87, 70};

        int menorIdade = idades[0];

        for (int idade : idades) {
            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }

        System.out.println("A menor idade é: " + menorIdade);
    }
}
