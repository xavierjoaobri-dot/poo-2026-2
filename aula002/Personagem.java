public class Personagem {

    String nome;
    int nivel;
    int vida;
    int forca;

    void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Forca: " + forca);
    }

    void atacar(Personagem alvo) {
        System.out.println(nome + " atacou " + alvo.nome);
        alvo.vida = alvo.vida - forca;
        System.out.println(alvo.nome + " recebeu " + forca + " de dano");
    }

    void apresentar() {
        System.out.println(nome + " recebeu " + forca + " de dano");
    }

    void vida(){
        if (vida <= 0) {
    System.out.println(" morreu");
    }
}
}