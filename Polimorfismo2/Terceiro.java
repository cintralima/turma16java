package Polimorfismo2;

public class Terceiro extends  Empregado{
    private double acrescimo;

    public Terceiro(String nome, int Matricula,double acrescimo) {
        super(nome, Matricula);
        this.acrescimo = acrescimo;
    }

    public Terceiro(String nome, int matricula, int horas, int valorHoras, double acrescimo) {
        super(nome, matricula, horas, valorHoras);
        this.acrescimo = acrescimo;
    }

    @Override
    public double salario() {
        return super.salario() * acrescimo;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(int acrescimo) {
        this.acrescimo = acrescimo;
    }
}
