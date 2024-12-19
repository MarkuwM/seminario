package Seminario.faculdade;

public class AntesDoOptional {
    public static void main(String[] args) {
        String nome = buscarNome();

        if (nome != null) {
            System.out.println("Nome encontrado: " + nome);
        } else {
            System.out.println("Nome não encontrado!");
        }
    }

    public static String buscarNome() {
        String nome = null;
        return nome;
    }
}


