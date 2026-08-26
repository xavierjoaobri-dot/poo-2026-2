public class Personagem {

    String nome;
    int vida;
    int forca;
    int nivel;

    // Construtor
    public Personagem(String nome, int vida, int forca, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.nivel = nivel;
    }

    // Mostra os atributos do personagem
    void exibirStatus() {
        System.out.println("\n===== STATUS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("Nível: " + nivel);
    }

    // Ataque
    void atacar(Personagem inimigo) {

        System.out.println(nome + " atacou " + inimigo.nome + "!");
        
        inimigo.vida -= forca;

        if (inimigo.vida < 0) {
            inimigo.vida = 0;
        }

        System.out.println(inimigo.nome + " perdeu " + forca + " de vida.");
        System.out.println("Vida de " + inimigo.nome + ": " + inimigo.vida);

        if (inimigo.vida <= 0) {
            System.out.println("💀 " + inimigo.nome + " morreu!");
        }
    }

    // Verifica se está vivo
    boolean estaVivo() {
        return vida > 0;
    }
}