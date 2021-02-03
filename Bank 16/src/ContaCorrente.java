public class ContaCorrente extends Conta {
    private int quantidadeTalao = 3;

    public ContaCorrente(String numero, String cpf) {
        super(numero, cpf);
    }

    public boolean pegarTalao(int quantidadeTalao){
       if (this.quantidadeTalao <= quantidadeTalao) {
           this.quantidadeTalao-= quantidadeTalao;
           return true;
       }
       return false;
    }


}
