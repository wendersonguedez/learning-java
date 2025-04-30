package fundamentos.casting;

import java.util.Scanner;

public class NomeParaAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("O nome " + nome + " na tabela ASCII ficaria: ");
        for (int i = 0; i < nome.length(); i++) {
            char caracterNome = nome.charAt(i);
            int ascii = (int) caracterNome;
            System.out.println(caracterNome + " → " + ascii);
        }

        scanner.close();
    }
}
