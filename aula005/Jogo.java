public class Jogo {

    private String titulo;
    private String plataforma;
    private String classificacao;

    public Jogo(String titulo, String plataforma, String classificacao) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.classificacao = classificacao;
    }

    public void exibirStatus() {
        System.out.println("Título: " + titulo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Classificação: " + classificacao);
        System.out.println("Status: Disponível");
    }

    public String getTitulo() {
        return titulo;
    }
}