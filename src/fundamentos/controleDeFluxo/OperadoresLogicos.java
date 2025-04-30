package fundamentos.controleDeFluxo;

public class OperadoresLogicos {
    public static void main(String[] args) {
        exemploAnd();
        exemploOr();
        exemploNot();
        exemploCombinado();
    }

    public static void exemploAnd() {
        int idade = 25;
        boolean temCNH = true;

        if (idade >= 18 && temCNH) {
            System.out.println("pode digirir meu parceiro, seja feliz!!");
        } else {
            System.out.println("num vai tá tendo hein!");
        }
    }

    public static void exemploOr() {
        boolean temCartao = false;
        boolean temDinheiro = true;

        if (temCartao || temDinheiro) {
            System.out.println("faz a festa meu patrão");
        } else {
            System.out.println("ta duro? dorme!");
        }
    }

    public static void exemploNot() {
        boolean taSoChuvaChichica = true;

        if (!taSoChuvaChichica) {
            System.out.println("bora dalhe");
        } else {
            System.out.println("bora ficar em casa que a gente ganha mais");
        }
    }

    public static void exemploCombinado() {
        int idade = 17;
        boolean temAutorizacao = true;
        boolean acompanhadoPorResponsavel = false;

        if ((idade >= 18) || (temAutorizacao && acompanhadoPorResponsavel)) {
            System.out.println("pode entrar na festa, faz estrago");
        } else {
            System.out.println("hoje vai ficar só no cheirinho");
        }
    }
}
