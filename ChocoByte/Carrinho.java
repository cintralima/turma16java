import java.util.List;

public class Carrinho extends Produto {
    private double valorTotal;
    private List<Produto> lista;

    public Carrinho(String nome, double valor, int estoque, int cod) {
        super(nome, valor, estoque, cod);
    }

    public void adicionar(int quantidade){


    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }


}
