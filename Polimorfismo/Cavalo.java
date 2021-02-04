package Polimorfismo;

public class Cavalo extends Animal {


    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public String Correr(boolean x){
        if (true){
            return "Correndo";
        }
        return "Parado";
    }

    @Override
    public String emitiRSom() {
        return "Rinchando";
    }
}


