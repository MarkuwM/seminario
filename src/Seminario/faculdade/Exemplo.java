package Seminario.faculdade;

import java.util.Optional;

public class Exemplo {
    public static void main(String[] args) {
        Optional<String> nome = Optional.empty();

        System.out.println("Valor encontrado: "+nome.get());

    }
}
