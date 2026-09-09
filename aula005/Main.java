public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("João Otávio", "(47) 99999-9999");

        Jogo jogo = new Jogo("GTA V", "PC", "18 anos");

        Emprestimo emprestimo = new Emprestimo(cliente, jogo, true);

        cliente.exibirStatus();

        System.out.println();

        jogo.exibirStatus();

        System.out.println();

        emprestimo.exibirStatus();

        System.out.println();
    }
}