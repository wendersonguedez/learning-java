package intermediario;

public class Ninja {
    String name;
    String village;
    int age;

    // Criando um metodo público que não retorna nada (void).
    public void SharinganAtivado() {
        System.out.println("A porra do sharingan ativou!!");
    }

    // Criando um metodo do tipo String, sendo necessário retornar uma String.
    public String OqueEuSou() {
        return "Eu sou um ninja!!";
    }

    public int anosParaSeTornarHokage(int minimumAgeToBeHokage) {
        return minimumAgeToBeHokage - age;
    }
}
