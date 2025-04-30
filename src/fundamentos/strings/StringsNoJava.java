package fundamentos.strings;

public class StringsNoJava {
    public static void main(String[] args) {
        String saudacao = "Olá, ";
        String nome = "wend";
        String sobrenome = " guedes";
        String falandoDoJava = "Bem vindo ao Java!";
        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Nome completo: " + nomeCompleto);

        /**
         * Concatenação de strings
         */
        String mensagem = saudacao + nome + "! " + falandoDoJava;
        System.out.println(mensagem);

        /**
         * Métodos úteis da classe String
         */
        System.out.println("Tamanho da mensagem: " + mensagem.length());
        System.out.println("Mensagem em maiúsculo: " + mensagem.toUpperCase());
        System.out.println("Mensagem em minúsculo: " + mensagem.toLowerCase());
        System.out.println("Exibindo apenas os três primeiros caracteres da string total: " + mensagem.substring(0, 3));

        /**
         * Verifica se a variável contém a palavra passada
         */
        if (mensagem.contains("Java")) {
            System.out.println("A mensagem em questão menciona o Javinha!");
        } else {
            System.out.println("A mensagem em questão não menciona o Javinha :((");
        }

        String outraMensagem = "Olá, Wend! Bem vindo ao mundo do Javinha!";

        if (mensagem.equals(outraMensagem)) {
            System.out.println("As mensagens são iguais!!");
        } else {
            System.out.println("As mensagens não são iguais :((");
        }
    }
}
