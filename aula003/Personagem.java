import aula005.Personagem;

public class Personagem {
String nome;
int nível;
int vida;
int forca;
String arma;

boolean curado = false;

Personagem(String nome, int vida, int forca, int nível) {
    this.nome = nome;
    this.vida = vida;
    this.forca = forca;
    this.nível = nível;
}

void exibirStatus() {
    System.out.println("Nome: " + nome);
    System.out.println("Nível: " + nível);
    System.out.println("Vida: " + vida);
    System.out.println("forca: " + forca);
}

void equipar(arma novaArma) {
    arma = novaArma;
    System.out.println(nome + " equipou: " + arma.nome);
}

void atacar(Personagem alvo) {

    int danoTotal = forca;

    if (arma != null) {
        danoTotal += arma.dano;
    }

    alvo.receberDano(danoTotal);

    System.out.println(nome + " atacou " + alvo.nome);
    System.out.println("Dano causado: " + danoTotal);
    System.out.println(alvo.nome + " ficou com " + alvo.vida + " de vida");
}

void receberDano(int dano) {

    vida -= dano;

    System.out.println(nome + " recebeu " + dano + " de dano");
    System.out.println("Vida restante: " + vida);

    if (!estaVivo()) {
        System.out.println(nome + " foi derrotado.");
        return;
    }

    if (vida <= 10 && !curado) {
        curar(vida / 2);
        System.out.println(nome + " se curou!");
        System.out.println("Vida após cura: " + vida);
    }
}

boolean estaVivo() {
    return vida > 0;
}

void curar(int cura) {
    this.vida += cura;
    this.curado = true;
}
}
   