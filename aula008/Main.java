public class Main {
    public static void cadastrar(String nome, int energia) {
        if ( nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }
        if ( energia < 0 ) {
            throw new IllegalArgumentException("Energia não pode ser negativa.");
        }

        System.out.println("Cadastro aceito: " + nome + " , energia: " + energia);
    }

    public static void main(String[] args) {
        
        try {
            cadastrar("", 5);
            cadastrar("João", -1);
        } catch (IllegalArgumentException erro) {
            
            System.out.println("Cadastro recusado: " + erro.getMessage());
        }
    }


}