public class Produto {
    private int codigo;
    private String descricao;
    private double valor;

    public Produto(String descricao){
        this.descricao = descricao;

    }
    public Produto(String descricao,int codigo){
        this.descricao = descricao;
        this.codigo = codigo;

    }
    public Produto(String descricao,int codigo, double valor){
        this.descricao = descricao;
        this.codigo = codigo;
        this.valor = valor;

    }


}
