package fundamentosJava.tiposPrimitivos;

public class TiposPrimitivos {
     public static void main(String[] args) {
         String nome = "wenderson";
         int idade = 25;
         double salarioMensal = 4500.00;
         char genero = 'M';
         boolean taEmpregado = true;
         String resultado = (taEmpregado) ? "tem emprego" : "ta desempregado";

         System.out.println(nome + " " + resultado + ", recebe R$" + salarioMensal + " e tem " + idade + " de idade");
     }

     public void example() {
         System.out.println("Exemplo de tipos primitivos. Classe sendo importada!");
     }
}
