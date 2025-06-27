package intermediario.classesEObjetos;

public class Main {
    public static void main(String[] args) {
        // Criando o ninja Sasuke, onde Sasuke é um objeto.
        Ninja SasukeObj = new Ninja();

        // Atribuindo valores ao objeto Sasuke.
        SasukeObj.age = 21;
        SasukeObj.name = "Sasuke Uchiha";

        // Fazendo o mesmo, mas agora criando o ninja Naruto.
        Ninja NarutoObj = new Ninja();
        NarutoObj.name = "Naruto Uzumaki";
        NarutoObj.age = 16;

        NarutoObj.SharinganAtivado();

        String chamandoMetodoString = NarutoObj.OqueEuSou();
        System.out.println(chamandoMetodoString);

        int quantoTempoFaltaParaSerHokage = NarutoObj.anosParaSeTornarHokage(50);
        System.out.println("Você tem " + NarutoObj.age + " anos e faltam no minimo " + quantoTempoFaltaParaSerHokage +
                " anos para " + "você se tornar Hokage");

    }
}
