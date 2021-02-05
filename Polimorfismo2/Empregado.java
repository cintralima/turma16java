package Polimorfismo2;

public class Empregado {
    private String nome;
    private int matricula;
    private int horas;
    private int valorHoras;

    public Empregado(String nome, int matricula, int horas, int valorHoras) {
        this.nome = nome;
        this.matricula = matricula;
        this.horas = horas;
        this.valorHoras = valorHoras;
    }

    public Empregado(String nome){
        this.nome =nome;
        this.nome =nome;
    }

    public Empregado(String nome, int Matricula){
        this.nome =nome;
        this.matricula =matricula;
    }


    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", horas=" + horas +
                ", valorHoras=" + valorHoras +
                '}';
    }

    public double salario(){

        return this.horas * this.valorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(int valorHoras) {
        this.valorHoras = valorHoras;
    }
}
