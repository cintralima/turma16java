public class Produto {

    private String nome;
    private double valor;
    private int estoque;
    private int cod;

    public Produto(String nome, double valor, int estoque, int cod) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.cod = cod;
    }

    @Override
    public String toString() {
        return cod+"\t"+nome+"\t"+valor+"\t"+estoque;
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

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }



}
