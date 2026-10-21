public class TorreDefesa implements Atacante {
    private final String local;

    public TorreDefesa(String local) {
        this.local = local;
    }

    @Override
    public void atacar() {
        System.out.println("Torre de Defesa " + local + " Disparou.");
    }
}