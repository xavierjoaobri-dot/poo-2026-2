public class Main {

    public static void main(String[] args) {

        // Criando os personagens
        Personagem guerreiro = new Personagem("Davi", 100, 25, 2);
        Personagem mago = new Personagem("Roger", 60, 30, 2);
        Personagem goblin = new Personagem("Laura", 80, 15, 1);

        // =========================
        // COMEÇO DA HISTÓRIA
        // =========================

        System.out.println("=================================");
        System.out.println("       ⚔️ A BATALHA COMEÇA ⚔️");
        System.out.println("=================================");

        System.out.println();
        System.out.println("📖 NARRADOR:");
        System.out.println("Uma noite escura tomou conta da floresta...");
        System.out.println("O guerreiro " + guerreiro.nome + " caminhava pela estrada.");
        System.out.println("Ao seu lado estava o poderoso mago " + mago.nome + ".");
        System.out.println();
        System.out.println("De repente...");
        System.out.println();
        System.out.println("👹 Um goblin chamado " + goblin.nome + " apareceu!");
        System.out.println("\"Vocês não passarão daqui!\"");

        // Mostrar status
        guerreiro.exibirStatus();
        mago.exibirStatus();
        goblin.exibirStatus();

        System.out.println();
        System.out.println("📖 NARRADOR:");
        System.out.println("A batalha começou!");

        // =========================
        // BATALHA
        // =========================

        while (goblin.estaVivo() && (guerreiro.estaVivo() || mago.estaVivo())) {

            // Guerreiro ataca
            if (guerreiro.estaVivo() && goblin.estaVivo()) {

                System.out.println();
                System.out.println("🗡️ " + guerreiro.nome + " avança!");

                guerreiro.atacar(goblin);
            }

            // Mago ataca
            if (mago.estaVivo() && goblin.estaVivo()) {

                System.out.println();
                System.out.println("🧙 " + mago.nome + " prepara seu feitiço!");

                mago.atacar(goblin);
            }

            // Goblin contra-ataca
            if (goblin.estaVivo()) {

                System.out.println();
                System.out.println("👹 O goblin " + goblin.nome + " contra-ataca!");

                if (guerreiro.estaVivo()) {
                    goblin.atacar(guerreiro);
                } 
                else if (mago.estaVivo()) {
                    goblin.atacar(mago);
                }
            }
        }

        // =========================
        // FINAL DA BATALHA
        // =========================

        System.out.println();
        System.out.println("=================================");
        System.out.println("          🏆 FIM DA BATALHA");
        System.out.println("=================================");

        System.out.println();
        System.out.println("📖 NARRADOR:");

        if (!goblin.estaVivo()) {

            System.out.println(
                "O goblin " + goblin.nome +
                " foi derrotado!"
            );

            System.out.println(
                "🎉 " + guerreiro.nome +
                " e " + mago.nome +
                " venceram a batalha!"
            );

        } else {

            System.out.println(
                "Os heróis foram derrotados..."
            );

            System.out.println(
                "👹 O goblin " + goblin.nome +
                " venceu!"
            );
        }
    }
}