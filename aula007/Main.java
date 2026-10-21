public class Main {
    public static void main(String[] args) {
        
     System.out.println("========");
 
     Atacante[] atacantes = {
        new Guerreiro("Golias"),
        new Mago("Gandalf"),
        new Armadilha("Espinhos"),
        new Arqueiro("Robin"),
        new TorreDefesa("Norte")

     };

     for (Atacante item : atacantes) {
        item.atacar();
     }


    }
}