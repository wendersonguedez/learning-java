package fundamentos.controleDeFluxo;

public class IfElse {
    public static void main(String[] args) {
        String linguagem = "Java";
        int idade = 18;
        boolean temEmprego = false;
        int a = 1;
        int b = 20;

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade == 18) {
            System.out.println("Tem exatamente 18 anos");
        } else {
            System.out.println("Maior de idade");
        }

        if (linguagem.equals("Java")) {
            System.out.println("A linguagem é Java!");
        } else {
            System.out.println("A linguagem não é Java :(");
        }

        if (!temEmprego) {
            System.out.println("tu não tem emprego meu brother? bora correr atras de um hein");
        } else {
            System.out.println("queria ser igual tu e ter um emprego meu parceiro ");
        }

        if (a != b) {
            System.out.println("A é diferente de B");
        } else {
            System.out.println("A não é diferente de B");
        }
    }
}
