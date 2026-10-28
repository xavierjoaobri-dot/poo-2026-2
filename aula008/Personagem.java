public class Personagem implements Atacante {
    private final String nome;
    private int energia;


    public Personagem( String nome, int energiaInicial) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        } 
        if (energiaInicial < 0) {
            throw new IllegalArgumentException("Energia não pode ser negativa");
        }

        this.nome = nome;
        this.energia = energiaInicial;
    }

    public String getNome() {
        return nome;
    }
    public int getEnergia() {
        return energia;
    }

    protected final void consumirEnergia(int custo) throws SemEnergiaException {
        if (custo <= 0 ) {
            throw new IllegalArgumentException("O custo tem que ser positivo");
        }
        if (energia < custo) {
            throw new SemEnergiaException( nome + " precisa de " + custo + " de energia");
        }
    }

}