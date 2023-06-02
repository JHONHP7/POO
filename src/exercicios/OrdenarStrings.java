package exercicios;

import java.util.Arrays;

public class OrdenarStrings {
    public static void main(String[] args) {
        String[] strings = {"banana", "abacaxi", "laranja", "uva", "manga"};

        // Ordenar o array de strings em ordem alfabética
        Arrays.sort(strings);

        // Exibir o array de strings ordenado
        for (String str : strings) {
            System.out.println(str);
        }
    }
}