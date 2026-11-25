package aula009;

public class Tosa extends Servico {

    @Override
    public double calcularPreco(Animal animal) {

        if (animal.isPeloLongo()) {
            return 60.00;
        }

        return 45.00;
    }

    @Override
    public String getNome() {
        return "Tosa";
    }
}