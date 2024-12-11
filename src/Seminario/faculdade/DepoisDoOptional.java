package Seminario.faculdade;

import java.util.Optional;

public class DepoisDoOptional {
    public static void main(String[] args) {
        Optional<String> nome = buscarNome();

        nome.ifPresentOrElse(
                valor -> System.out.println("Nome encontrado: " + valor),
                () -> System.out.println("Nome não encontrado!")
        );
    }

    public static Optional<String> buscarNome() {
        return Optional.empty();
    }
}

