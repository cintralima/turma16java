public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;



    public void calculoPorcentagem(double salarioBase, double imposto){
        this.imposto = (salarioBase * imposto) / 100;
    }

    public double calcularSalario(double salarioBase){
        return salarioBase - this.imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }


    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
