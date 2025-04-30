package fundamentos.estruturasDeRepeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // contadorDecrescente();
        // System.out.println("----------------------");
        contadorCrescente();
        //validaSenha();
    }

    public static void contadorDecrescente() {
        int contador = 10;

        while (contador >= 1) {
            System.out.println("contador decrescente: " + contador);
            contador--;
        }
    }

    public static void contadorCrescente() {
        int contador = 1;

        while (contador <= 10) {
            System.out.println("contador crescente: " + contador);

            contador++;
        }
    }

    public static void validaSenha() {
        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "caraidigdin";
        String senhaDigitada;

        System.out.println("Digite a senha: ");
        senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta! Tente novamente: ");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Acesso concedido!");
        scanner.close();

    }
}
