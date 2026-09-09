import aula005.arma;

public class Main{ 
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem("Davi", 100, 25, 2);
        Personagem goblin = new Personagem("Laura", 20, 7, 1);
        Personagem mago = new Personagem("Roger", 50, 20, 2);
        Personagem troll = new Personagem("Kaleb", 110, 15, 5);

        guerreiro.exibirStatus();
        goblin.exibirStatus();
        mago.exibirStatus();
        

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