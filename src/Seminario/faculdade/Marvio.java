package Seminario.faculdade;

import java.util.Optional;

public class Marvio {
    public static void main(String[] args) {

        // exemplo 2, filter()
        Optional<Integer> idade = Optional.of(20);

        idade.filter(i -> i >= 18)
                .ifPresent(i -> System.out.println("Maior de idade")); // Executa*/
    }
}
