public class Conta {

    private String numero;
    private String cpf;
    private double saldo;

    public Conta(String numero,String cpf){
        this.numero = numero;
        this.cpf = cpf;

    }

    public Conta(String numero) {
        this.numero = numero;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public boolean debitar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }


}
