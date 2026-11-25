package aula009;

public class Main {

    public static void main(String[] args) {

        Animal bento = new Animal("Bento", "Lia", true, true);

        Servico banho = new Banho();
        Servico tosa = new Tosa();

        Atendimento atendimentoBanho =
            new Atendimento(bento, banho);

        Atendimento atendimentoTosa =
            new Atendimento(bento, tosa);

        System.out.println("=== AGENDAMENTOS ===");

        atendimentoBanho.exibir();
        atendimentoTosa.exibir();

        System.out.println("\n=== CONCLUINDO BANHO ===");

        if (atendimentoBanho.concluir()) {
            System.out.println("Banho concluído com sucesso!");
        }

        atendimentoBanho.exibir();
        atendimentoTosa.exibir();

        System.out.println("\n=== NOVA TENTATIVA ===");

        if (atendimentoBanho.concluir()) {
            System.out.println("Serviço concluído!");
        } else {
            System.out.println("Este banho já foi concluído!");
        }

        System.out.println("\n=== SITUAÇÃO FINAL ===");

        atendimentoBanho.exibir();
        atendimentoTosa.exibir();
    }
}
