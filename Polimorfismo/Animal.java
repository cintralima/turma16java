package Polimorfismo;

public abstract class Animal {
    private String nome;
    private int idade;



    public Animal(String nome,int idade){
        this.setNome(nome);
        this.setIdade(idade);

    }

    public abstract String emitiRSom();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
