public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;



    public double obterSaldo(double vc, double vd){

        return vc - vd;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

}
