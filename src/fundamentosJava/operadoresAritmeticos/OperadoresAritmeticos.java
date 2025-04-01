package fundamentosJava.operadoresAritmeticos;
import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numberOne = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numberTwo = scanner.nextDouble();

        double soma = numberOne + numberTwo;
        double subtracao = numberOne - numberTwo;
        double divisao = numberOne / numberTwo;
        double multiplicacao = numberOne * numberOne;
        double modulo = numberOne % numberTwo;

        System.out.println("\nRESULTADO:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Módulo: " + modulo);

        scanner.close();
    }
}
