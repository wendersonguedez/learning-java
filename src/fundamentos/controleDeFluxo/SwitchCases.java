package fundamentos.controleDeFluxo;

public class SwitchCases {
    public static void main(String[] args) {
        // diasDaSemana();
        menuInterativo();
    }

    public static void diasDaSemana() {
        /**
         * Supondo que:
         * 1 - Domingo
         * 2 - Segunda
         * 3 - etc...
         */
        int dia = 3;

        /**
         * O "break;" é necessário para evitar que as instruções seguintes sejam executadas em cascata.
         */
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Número inválido");
        }
    }

    public static void menuInterativo() {
        System.out.println("|-- Teste Estrutura de Menu --|");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Novo Cadastro     |\n");
        System.out.print("| Opção 2 - Clientes          |\n");
        System.out.print("| Opção 3 - Produtos          |\n");
        System.out.print("| Opção 4 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");
    }
}
