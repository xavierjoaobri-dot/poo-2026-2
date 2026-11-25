package aula009;

public class Banho extends Servico {

    @Override
    public double calcularPreco(Animal animal) {

        if (animal.isGrande()) {
            return 40.00;
        }

        return 30.00;
    }

    @Override
    public String getNome() {
        return "Banho";
    }
}
