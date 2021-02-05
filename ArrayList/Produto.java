package ArrayList;

public class Produto {

    private String nome;
    private double valor;
    private int estoque;
    private int codigo;


    public Produto(String nome, double valor, int estoque, int codigo) {
        this.setNome(nome);
        this.setValor(valor);
        this.setEstoque(estoque);
        this.setCodigo(codigo);
    }



    @Override
    public String toString() {
        return nome+"\t"+valor+"\t"+estoque;
    }

    public void adiciona(int valor){
        this.estoque+= valor;
    }
    public void retira(int valor){
        this.estoque-= valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
