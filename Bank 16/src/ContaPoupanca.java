public class ContaPoupanca extends Conta {

    private int dataAniversario;

    public ContaPoupanca(String numero,int dataAniversario) {
        super(numero);
        this.setDataAniversario(dataAniversario);
    }



    public void acrescimoJuros(int dataAniversario){
        if(this.getDataAniversario() >= dataAniversario){
           double va = super.getSaldo() * 0.05;
           super.creditar(va);

        }

    }

    public int getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(int dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}
