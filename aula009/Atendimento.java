package aula009;

public class Atendimento {

    private Animal animal;
    private Servico servico;
    private boolean concluido;

    public Atendimento(Animal animal, Servico servico) {
        this.animal = animal;
        this.servico = servico;
        this.concluido = false;
    }

    public boolean concluir() {

        if (concluido) {
            return false;
        }

        concluido = true;
        return true;
    }

    public void exibir() {

        String situacao;

        if (concluido) {
            situacao = "Concluído";
        } else {
            situacao = "Agendado";
        }

        System.out.println(
            servico.getNome() +
            " por R$ " + servico.calcularPreco(animal) +
            " | " + situacao
        );
    }
}