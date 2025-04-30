package fundamentos.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListHandler {
    public static void main(String[] args) {
        // listaDeCompras();
        // removendoElementoDaListaDeCompras();
        // mudandoElementoDaListaDeCompras();
        // quantidadeDeElementos();
        // usandoLoopFor();
        usandoLoopForeach();
    }

    /**
     * Método que retorna uma lista inicial padrão.
     */
    public static List<String> getListDeComprasInicial() {
        return new ArrayList<>(Arrays.asList("Frango", "Macarrão", "Cebola Roxa"));
    }

    /**
     * Método que cria uma lista de compras utilizando um ArrayList
     * baseado em uma lista inicial padrão retornada por getListDeComprasInicial().
     *
     * Em seguida, adiciona um novo item ("Pimentinha") à lista.
     *
     * A linha que acessa o índice 1 retorna o segundo item da lista ("Macarrão"),
     * pois a indexação em listas começa em 0.
     *
     * Por fim, imprime o item na posição 1 e a lista completa.
     */
    public static void listaDeCompras() {
        List<String> listaDeCompras = getListDeComprasInicial();

        listaDeCompras.add("Pimentinha");

        System.out.println(listaDeCompras.get(1)); // Macarrão
        System.out.println(listaDeCompras); // [Frango, Macarrão, Cebola Roxa, Pimentinha]
    }

    /**
     * Método que remove o elemento que está na posição 1 da lista.
     */
    public static void removendoElementoDaListaDeCompras() {
        List<String> listaDeCompras = getListDeComprasInicial();

        listaDeCompras.remove(1);

        System.out.println(listaDeCompras);
    }

    /**
     * Método que altera um elemento em determinada posição na lista.
     */
    public static void mudandoElementoDaListaDeCompras() {
        List<String> listaDeCompras = getListDeComprasInicial();

        listaDeCompras.set(2, "Pimentão");

        System.out.println(listaDeCompras);
    }

    /**
     * Método que exibe a quantidade de elementos na lista
     */
    public static void quantidadeDeElementos() {
        List<String> listaDeCompras = getListDeComprasInicial();

        System.out.println(listaDeCompras.size());
    }

    /**
     * Este método percorre uma lista de compras, construída por um método chamado getListDeComprasInicial(), e
     * cria uma string formatada com todos os itens da lista, separados por vírgulas.
     *
     * A string final é exibida no console com a frase "Minha lista de compras: " seguida de todos os itens da lista.
     *
     * Exemplo de saída:
     * "Minha lista de compras: Sal, Pimenta, Açúcar"
     */
    public static void usandoLoopFor() {
        List<String> listaDeCompras = getListDeComprasInicial();

        StringBuilder resultado = new StringBuilder("Minha lista de compras: ");

        for (int i = 0; i < listaDeCompras.size(); i++) {
            // Adiciona o item da lista à sequência de caracteres
            resultado.append(listaDeCompras.get(i));

            // Se não for o último item, adiciona uma vírgula e espaço
            if (i < listaDeCompras.size() - 1) {
                resultado.append(", ");
            }
        }

        System.out.println(resultado.toString());
    }

    /**
     * Mesmo funcionalidade do método acima usandoLoopFor(), mas utilizando o loop foreach
     */
    public static void usandoLoopForeach() {
        List<String> listaDeCompras = getListDeComprasInicial();

        StringBuilder resultado = new StringBuilder("Minha lista de compras: ");

        boolean primeiroItem = true;

        for (String item : listaDeCompras) {
            if (!primeiroItem) {
                resultado.append(", ");
            }
            resultado.append(item);

            primeiroItem = false;
        }

        System.out.println(resultado.toString());
    }

    /**
     * Utilizando o método .forEach diretamente na minha lista
     */
    public static void usandoMetodoForeach() {
        List<String> listaDeCompras = getListDeComprasInicial();

        listaDeCompras.forEach(item -> System.out.println(item));
    }
}
