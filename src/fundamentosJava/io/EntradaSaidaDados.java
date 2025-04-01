package fundamentosJava.io;

import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {
        /**
         * System.in é usado para capturar o que o usuário digita no console. Ou seja, é para entrada de dados.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        /**
         * Exemplo:
         * wenderson --> Wenderson
         * evelyn --> Evelyn
         *
         * Transforma a primeira letra da string em maiúscula (capitalize).
         * Faz isso pegando o primeiro caractere com substring(0, 1),
         * convertendo para maiúscula com toUpperCase(), e depois concatenando
         * com o restante da string a partir do segundo caractere (substring(1)).
         */
        String nomeCompletoComCapitalize = nomeCompleto.substring(0, 1).toUpperCase() + nomeCompleto.substring(1);

        System.out.print("Olá, " + nomeCompletoComCapitalize + "!" + " Quantos anos você tem? ");
        int idade = scanner.nextInt();

        System.out.print("Você está empregado? True/False: ");
        boolean empregado = scanner.nextBoolean();

        String fraseCompleta = "Você se chama " + nomeCompletoComCapitalize + " e tem " + idade + " anos de idade";

        if (empregado) {
            fraseCompleta += " e está atualmente empregado!";
        } else {
            fraseCompleta += " e não está empregado no momento :(";
        }

        System.out.println(fraseCompleta);
    }
}
