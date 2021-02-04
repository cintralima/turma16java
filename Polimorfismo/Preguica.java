package Polimorfismo;

public class Preguica extends Animal{


    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public String subirArvore(boolean x){
        if (true){
            return "Subindo Arvore";
        }
        return "Preguiçando";
    }

    @Override
    public String emitiRSom() {
        return "Bocejando";
    }
}

