public class Main{ 
    public static void main(String[] args) {
        Personagem gurreiro = new Personagem("Davi", 100, 25, 2);
        Personagem goblin = new Personagem("Laura", 20, 7, 1);
        Personagem mago = new Personagem("Roger", 50, 20, 2);

        gurreiro.exibirStatus();
        goblin.exibirStatus();
        mago.exibirStatus();
        
        public class agregar {
     public static void main(String() args) {

        Personagem guerreiro = new Peronagem("Roger", 100, 30, 2);
        Personagem troll = new Personagem("Troll", 110, 15, 5);
        Personagem mago = new Personagem("Patolino", 80, 40, 10);


        guerreiro.exibirStatus();
        troll.exibirStatus();
        mago.exibirStatus();

        Arma espada = new Arma("Espada de Ferro", 15);
        Arma machado = new Arma("Machado Viking", 15);
        Arma cajado = new Arma("Cajado do Caos", 15);

        espada.exibirStatus();
        machado.exibirStatus();
        cajado.exibirStatus();

        guerreiro.arma = espada;


    }
}
        public class Narrar {
    public static void main(String[] args) {

        Personagem guerreiro = new Personagem("Roger", 100, 30, 2);
        Personagem troll = new Personagem("Troll", 110, 15, 5);
        Personagem mago = new Personagem("Patolino", 80, 40, 10);

        System.out.println("===== INÍCIO DA BATALHA =====");

        guerreiro.exibirStatus();
        troll.exibirStatus();
        mago.exibirStatus();

        System.out.println("\n===== BATALHA =====");

        System.out.println(guerreiro.nome + " atacou " + troll.nome + "!");
        troll.vida -= guerreiro.forca;
        troll.exibirStatus();

        System.out.println("\n" + troll.nome + " contra-atacou!");
        guerreiro.vida -= troll.forca;
        guerreiro.exibirStatus();

        System.out.println("\n" + mago.nome + " lançou um ataque mágico!");
        troll.vida -= mago.forca;
        troll.exibirStatus();

        System.out.println("\n===== FIM DA BATALHA =====");

        if (guerreiro.vida <= 0) {
            System.out.println(guerreiro.nome + " morreu!");
        }

        if (troll.vida <= 0) {
            System.out.println(troll.nome + " morreu!");
        }

        if (mago.vida <= 0) {
            System.out.println(mago.nome + " morreu!");
        }
    }
}
    }

}