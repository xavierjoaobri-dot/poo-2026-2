package aula009;

public class Animal {

    private String nome;
    private String tutor;
    private boolean grande;
    private boolean peloLongo;

    public Animal(String nome, String tutor, boolean grande, boolean peloLongo) {
        this.nome = nome;
        this.tutor = tutor;
        this.grande = grande;
        this.peloLongo = peloLongo;
    }

    public String getNome() {
        return nome;
    }

    public String getTutor() {
        return tutor;
    }

    public boolean isGrande() {
        return grande;
    }

    public boolean isPeloLongo() {
        return peloLongo;
    }
}
