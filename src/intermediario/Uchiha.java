package intermediario;

public class Uchiha extends Ninja {

    /*
    * Criando um metodo público que não retorna nada (void).
    * */
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + name +" e eu ativei o meu sharingan!");
    }

    /*
    * Criando um metodo público do tipo String, sendo necessário retornar uma String.
    * */
    public String OqueEuSou() {
        return "Eu sou um ninja do clã Uchiha!";
    }
}
