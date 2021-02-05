package ArrayList;

import java.util.*;

public class Estoque {
    public static void main(String[] args) {
        String nome;
        double valor;
        int estoque,codigo = 0, opcao;
        Scanner ler = new Scanner(System.in);
        Map<Integer, Produto> mapa = new TreeMap<Integer, Produto>();
        List leo;

        do {

            System.out.println("\nBem vindo ao Estoque");
            System.out.println("Deseja:\nDigite 1 - Cadastrar Novo Produto\n" +
                    "Digite 2 - Adicionar \n" +
                    "Digite 3 - Retirar\n" +
                    "Digite 4 - Sair");
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o codigo do produto");
                codigo = ler.nextInt();
                System.out.println("Digite o nome do produto:");
                nome = ler.next();
                System.out.println("Digite o valor:");
                valor = ler.nextDouble();
                System.out.println("Digite a quantidade:");
                estoque = ler.nextInt();

                if (mapa.containsKey(codigo) == true) {
                    System.out.printf("\nO produto %s ja existi", mapa.get(codigo).getNome());
                    System.out.printf("\nDigite a quantidade que deseja acrescentar no estoque");
                    estoque = ler.nextInt();
                    mapa.get(codigo).adiciona(estoque);


                } else {


                    mapa.put(codigo, new Produto(nome, valor, estoque, codigo));

                }

            }
            if (opcao == 2) {

                System.out.println("Digite o codigo do produto");
                codigo = ler.nextInt();
                System.out.printf("\nO produto que você escolheu é %s ", mapa.get(codigo).getNome());
                System.out.printf("\nDigite a quantidade que deseja acrescentar no estoque");
                estoque = ler.nextInt();

                mapa.get(codigo).adiciona(estoque);


            }

            if (opcao == 3) {

                System.out.println("Digite o codigo do produto");
                codigo = ler.nextInt();
                System.out.printf("\nO produto que você escolheu é %s ", mapa.get(codigo).getNome());
                System.out.printf("\nDigite a quantidade que deseja retirar no estoque");
                estoque = ler.nextInt();

                mapa.get(codigo).retira(estoque);


            }
            System.out.println("Produto\tValor\tEstoque");



        } while (opcao != 4);

        System.out.println("Fim de Progrma");

    }
}
