package Seminario.faculdade;

import java.util.Optional;

public class Marvio {
    public static void main(String[] args) {

        // Exemplo 1 , of() e ofNullable()

        /*Optional<String> prateleiraA = Optional.ofNullable("ifma");
        Optional<String> prateleiraB = Optional.ofNullable(null);
        System.out.println(prateleiraB.isPresent());*/


        // exemplo 3, filter()

        Optional<Integer> idade = Optional.of(20);

        idade.filter(i -> i >= 18)
                .ifPresent(i -> System.out.println("Maior de idade")); // Executa*/
    }
}
