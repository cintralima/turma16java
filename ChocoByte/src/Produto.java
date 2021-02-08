import java.util.Map;
import java.util.TreeMap;

public class Produto {

    private String nome;
    private double valor;
    private int estoque;
    private int compras;
    protected int cod;
    private static Map<Integer, Produto> listaProdutos = new TreeMap<Integer, Produto>();


    public static Map<Integer, Produto> getListaProdutos() {
        return listaProdutos;
    }

    public Produto() {

    }

    public Produto(String nome, double valor, int estoque, int cod) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.cod = cod;

    }

    public void cadastrarProduto(String nome, double valor, int estoque, int cod) {

        Produto.listaProdutos.put(cod, new Produto(nome, valor, estoque, cod));

    }

    public void inicio() {

        cadastrarProduto("Camisa", 10.50, 10, 1);
        cadastrarProduto("Chinelo", 14.50, 10, 2);
        cadastrarProduto("Bermuda", 34.50, 10, 3);
        cadastrarProduto("Meia", 14.40, 10, 4);
        cadastrarProduto("Calça", 45.70, 10, 5);
    }


    @Override
    public String toString() {
        return "\t" + nome + "\t\t" + valor + "\t" + estoque + "\n";
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

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }
}