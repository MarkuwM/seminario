package Seminario.faculdade;

import java.util.Optional;

public class MetodosOptional {
    public static void main(String[] args) {
        Optional<String> nome = buscarNome();

        nome.ifPresent(valor -> System.out.println("Nome encontrado: " + valor));

        String nomeFinal = nome.orElse("Padrão");
        System.out.println("Nome final (com padrão): " + nomeFinal);

        String nomeObrigatorio = nome.orElseThrow(() -> new IllegalArgumentException("Nome é obrigatório!"));
        System.out.println("Nome obrigatório: " + nomeObrigatorio);
    }

    public static Optional<String> buscarNome() {
        return Optional.empty();
    }
}
