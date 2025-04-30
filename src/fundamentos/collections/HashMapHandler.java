package fundamentos.collections;

import java.util.HashMap;

public class HashMapHandler {
    public static void main(String[] args) {
        exibirNotasDosAlunos();
    }

    public static HashMap<String, Double> getNotasDosAlunos() {
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("João", 7.5);
        notas.put("João", 7.5);
        notas.put("João", 7.5);
        notas.put("João", 7.5);
        notas.put("Maria", 9.0);
        notas.put("Pedro", 8.0);
        notas.put("Ana", 10.0);


        return notas;
    }

    public static void exibirNotasDosAlunos() {
        HashMap<String, Double> notas = getNotasDosAlunos();

        notas.forEach((aluno, nota) -> System.out.println(aluno + ": " + nota));
    }
}
