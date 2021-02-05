import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto novoProduto  = new Produto("camiseta",10.50,10,8);
        List<Produto> lista = new ArrayList<>();
        lista.add(novoProduto);
        Scanner ler = new Scanner(System.in);
        int opcao;

        System.out.print("\nBem vindo ao ChocoByte");
        System.out.println("\nCod\tProduto\t\tValor\tEstoque");

        System.out.println("\n"+ lista);

        System.out.print("\nEscolha o cod do produto desejado: ");
        opcao = ler.nextInt();


        System.out.println(lista.contains(opcao));









    }

}
