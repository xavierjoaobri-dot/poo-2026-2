public class arma {
    String nome;
    int dano;

    arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    void exibirStatus() {
        System.out.println("Arma: " + nome);
        System.out.println("Dano: " + dano);
    }
}