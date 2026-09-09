public class Emprestimo {

    private Cliente cliente;
    private Jogo jogo;
    private boolean status;

    public Emprestimo(Cliente cliente, Jogo jogo, boolean status) {
        this.cliente = cliente;
        this.jogo = jogo;
        this.status = status;
    }

    public void exibirStatus() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Jogo: " + jogo.getTitulo());

        if (status) {
            System.out.println("Status: Em andamento");
        } else {
            System.out.println("Status: Encerrado");
        }
    }
}