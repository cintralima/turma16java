package Polimorfismo;

public class Cachoro extends Animal {


    public Cachoro(String nome, int idade) {
        super(nome, idade);
    }

    public String deveCorrer(boolean x){
        if (true){
            return "Correndo";
        }
        return "Parado";
    }

    @Override
    public String emitiRSom() {
        return "latindo";
    }
}
