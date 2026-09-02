public class Main {

    public static void main(String[] args) {

        Personagem Moradora_de_rua_cega = new Personagem("Laura");

        Moradora_de_rua_cega.nome = "Laura";
        Moradora_de_rua_cega.vida = 5;
        Moradora_de_rua_cega.forca = 2;

        Personagem monstroN1 = new Personagem("Vinnicius");

        monstroN1.nome = "Vinnicius";
        monstroN1.vida = 10;
        monstroN1.forca = 5;

        Personagem monstroN2 = new Personagem("Roger");

        monstroN2.nome = "Roger";
        monstroN2.vida = 80;
        monstroN2.forca = 15;

        Moradora_de_rua_cega.exibirStatus();
        System.out.println();

        monstroN1.exibirStatus();
        System.out.println();

        monstroN2.exibirStatus();
        System.out.println();
        
        monstroN1.atacar(Moradora_de_rua_cega);

        System.out.println();

        Moradora_de_rua_cega.exibirStatus();

        Moradora_de_rua_cega.vida();

        monstroN1.atacar(monstroN2);
         
        System.out.println();

        monstroN2.exibirStatus();

        monstroN2.vida();


    
        
    }
}
