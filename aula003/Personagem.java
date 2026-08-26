public class personagem {

        String nome;
        int nível;
        int vida;
        int força;

        Arma arma;

        boolean curado = false;

        Personagem(String nome, int vida, int força, int nível) {
            this.nome = nome;
            this.vida = vida;
            this.força = força;
            this.nível = nível;

    }

    void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nível);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + força);
    }

    void equipar(Arma novaArma) {
        arma = novaArma;
        System.out.println(nome + " Equipou: " + arma.nome);
    }

    void atacar(Personagem alvo) {
        int danoTotal = força;
        if (arma != null) {
            danoTotal += arma.dano;
        }
        alvo.vida -= danoTotal;

        alvo.receberDano(danoTotal);


        System.out.println(nome + " atacou: " + alvo.nome);
        System.out.println("Dano causado: " + danoTotal);
        System.out.println(alvo.nome + " ficou com " + alvo.vida + " de vida");
    }


    void receberDano(int dano) {
        vida -= dano;
        if (!estaVivo()) {
            System.out.println(nome + " foi derrotado.");
        }
        System.out.println(nome + " recebeu " + dano + " de dano");
        System.out.println("Vida restante: " + vida);

        if (vida<=10 && !curado){
            alvo.curar(alvo.vida/2);
        }
        
    }

    boolean estaVivo() {
        return vida > 0;
    }

    void curar(double cura) {
        this.vida += cura;
        this.curado = true;
    }
}
    