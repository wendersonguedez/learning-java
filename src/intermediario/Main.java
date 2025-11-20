package intermediario;

public class Main {
    public static void main(String[] args) {
        /*
        * Criando o ninja Sasuke, onde Sasuke é um objeto.
        * */
        Uchiha SasukeObj = new Uchiha();

        /*
        * Atribuindo valores ao objeto Sasuke.
        * */
        SasukeObj.age = 21;
        SasukeObj.name = "Sasuke Uchiha";
        SasukeObj.SharinganAtivado();

        /*
        * Fazendo o mesmo, mas agora criando o ninja Naruto.
        * */
        Uzumaki NarutoObj = new Uzumaki();
        NarutoObj.name = "Naruto Uzumaki";
        NarutoObj.age = 16;
        NarutoObj.ModoSabioAtivado();

        String chamandoMetodoString = NarutoObj.OqueEuSou();
        System.out.println(chamandoMetodoString);

        int quantoTempoFaltaParaSerHokage = NarutoObj.anosParaSeTornarHokage(50);
        System.out.println("Seu nome é " + NarutoObj.name + " e faltam " + quantoTempoFaltaParaSerHokage + " anos para você ser hokage!");

        Boruto BorutoObj = new Boruto();
        BorutoObj.name = "Boruto Hyuga Uzumaki";
        BorutoObj.village = "Aldeia da folha";
        BorutoObj.ModoSabioAtivado();
        BorutoObj.AtivarOKarma();
        System.out.println(BorutoObj.name);
    }
}
