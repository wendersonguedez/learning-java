package intermediario;

public class Ninja {
    String name;
    String village;
    int age;

    /*
    * Criando um metodo do tipo String, sendo necessário retornar uma String.
    * */
    public String OqueEuSou() {
        return "Eu sou um ninja!";
    }

    /*
    * Metodo criado para retornar um inteiro, devido seu tipo especificado.
    * */
    public int anosParaSeTornarHokage(int minimumAgeToBeHokage) {
        return minimumAgeToBeHokage - age;
    }
}
