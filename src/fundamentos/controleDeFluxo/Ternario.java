package fundamentos.controleDeFluxo;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        imparOuPar();
        boasVindasAMaioridade();
    }

    public static void imparOuPar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + numero + " é " + resultado);
    }

    public static void boasVindasAMaioridade() {
        int idade = 18;

        String mensagem = (idade >= 21) ? "parabens seu merdeiro, atingiu a maioridade" : "tururu";

        System.out.println(mensagem);
    }
}
