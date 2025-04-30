package fundamentos.estruturasDeRepeticao;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        menuInterativo();
    }

    public static void menuInterativo() {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            /**
             * Verifica se a entrada é um número, se não for, a entrada será descartada
             */
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número válido.");
                scanner.next();
            }

            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida! Escolha entre 0 e 3.");
                continue; // Volta para o inicio do loop
            }

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção 1.");
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2.");
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
    }
}
