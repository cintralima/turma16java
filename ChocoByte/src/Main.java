import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String i = "%",nome ;
        int codigo, quantidade, opcao = 0,sexo;
        Scanner ler = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        Produto novo = new Produto();


        novo.inicio();

        do {

            System.out.print("Digite seu nome: ");
            nome = ler.next();
            Cliente novoCliente = new Cliente(nome);

            carrinho.getCarrinho().clear();
            carrinho.setValorTotal(0);
            for (Produto key : Produto.getListaProdutos().values()){
                key.setCompras(0);
            }

            System.out.print("Qual seu sexo?");
            System.out.println("\nDigite 1 - Masculino");
            System.out.println("Digite 2 - Feminino");
            System.out.println("Digite 3 - Outros");
            sexo = ler.nextInt();

            novoCliente.sexo(sexo);



            do {



                System.out.printf("\nBem vindo %s %s ao ChocoByte",novoCliente.getSexo(),novoCliente.getNome());
                System.out.print("\n--------------------------------");
                System.out.println("\nCod\tProduto\t\tValor\tEstoque");


                for (Produto key : Produto.getListaProdutos().values()){
                    System.out.println(key.getCod() + "\t" + key.getNome() + "\t" + key.getValor() + "\t" + key.getEstoque());
                }

                System.out.print("\nInsira o Codigo do produto que deseja comprar:");
                codigo = ler.nextInt();


                do {

                    System.out.print("\nDigite a quantidade que deseja comprar:");
                    quantidade = ler.nextInt();

                    if (quantidade <= Produto.getListaProdutos().get(codigo).getEstoque()) {

                        System.out.printf(
                                "\nVoce selecionou %d %s. Deseja adiconar ao Carrinho?\nDigite 1 - SIM\nDigite 2 - NÃO:",
                                quantidade, Produto.getListaProdutos().get(codigo).getNome());
                        opcao = ler.nextInt();

                        if (opcao == 1) {

                            carrinho.adicionarCarrinho(quantidade, codigo);
                            break;

                        }else {

                            break;
                        }

                    } else {

                        System.out.print("\nQuantidade insufieciente no estoque");
                        System.out.printf("\nQuandidade disponivel: %d", Produto.getListaProdutos().get(codigo).getEstoque());

                    }

                } while (quantidade > novo.getEstoque());

                System.out.print("\nDigite 1 - Comprar mais produtos");
                System.out.print("\nDigite 2 - Finalizar Comprar");
                opcao = ler.nextInt();


            } while (opcao == 1);
            System.out.println("---------------------------------CARRINHO DE COMPRAS---------------------------------");

            System.out.println("-------------------------------------------------------------------------------------");

            System.out.println("\nCod\tProduto\t\tValor\tUnidades");


            for (Produto key : carrinho.getCarrinho().values()) {
                System.out.println(key.getCod() + "\t" + key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
            }

            System.out.printf("\nO valor total da sua compra é R$%.2f", carrinho.getValorTotal());
            System.out.println("\n-------------------------------------------------------------------------------------");



            System.out.println("\nFormas  de Pagamento");
            System.out.printf("Digite 1 - A VISTA    - 10%s DESCONTO     - \tR$ %.2f\n", i, carrinho.carrinhoAvissta());
            System.out.printf("Digite 2 - CREDITO 1X - SEM DESCONTO     - \tR$ %.2f\n", carrinho.getValorTotal());
            System.out.printf("Digite 3 - CREDITO 2X - 10%s JUROS        - \tR$ %.2f\n", i, (carrinho.getValorTotal()*1.1));
            System.out.printf("Digite 4 - CREDITO 3X - 15%s JUROS        - \tR$ %.2f\n", i, (carrinho.getValorTotal()*1.15));
            System.out.print("\nSelecione uma Opção de Pagamento [1-4]: ");
            opcao = ler.nextInt();

            if (opcao == 1){
                System.out.println("                           CUPOM FISCAL   ");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
                System.out.println("Produto\t\tValor\tUnidades");
                for (Produto key : carrinho.getCarrinho().values()) {
                    System.out.println(key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
                }
                System.out.printf("Valor Imposto \t\tR$%.2f\n", carrinho.imposto());
                System.out.printf("Valor a Vista  \t\tR$%.2f\n", carrinho.carrinhoAvissta());
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("09/02/2021"); //data
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.printf("\nConsumidor %s",novoCliente.getNome()+"\n");
                System.out.println("-------------------------------------------------------------------------------------");

            }

            if (opcao == 2){
                System.out.println("                           CUPOM FISCAL   ");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
                System.out.println("Produto\t\tValor\tUnidades");
                for (Produto key : carrinho.getCarrinho().values()) {
                    System.out.println(key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
                }
                System.out.printf("Valor 1/1 \t\tR$%.2f\n", carrinho.getValorTotal());
                System.out.printf("Valor Imposto \t\tR$%.2f\n", carrinho.imposto());
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("09/02/2021"); //data
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.printf("\nConsumidor %s",novoCliente.getNome()+"\n");
                System.out.println("\n-------------------------------------------------------------------------------------");

            }
            if (opcao == 3){
                System.out.println("                           CUPOM FISCAL   ");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
                System.out.println("Produto\t\tValor\tUnidades");
                for (Produto key : carrinho.getCarrinho().values()) {
                    System.out.println(key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
                }
                System.out.printf("Valor Pago 1/2 \t\tR$%.2f\n", carrinho.carrinho2x());
                System.out.printf("Valor Imposto \t\tR$%.2f\n", carrinho.imposto());
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("09/02/2021"); //data
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.printf("\nConsumidor %s:",novoCliente.getNome()+"\n");
                System.out.println("\n-------------------------------------------------------------------------------------");

            }
            if (opcao == 4){
                System.out.println("                           CUPOM FISCAL   ");
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
                System.out.println("Produto\t\tValor\tUnidades");
                for (Produto key : carrinho.getCarrinho().values()) {
                    System.out.println(key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
                }
                System.out.printf("Valor Pago 1/3 \t\tR$%.2f\n", carrinho.carrinho3x());
                System.out.printf("Valor Imposto \t\tR$%.2f\n", carrinho.imposto());
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("09/02/2021"); //data
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.printf("Consumidor %s",novoCliente.getNome()+"\n");
                System.out.println("-------------------------------------------------------------------------------------");

            }


            System.out.print("Novo Cliente [1-SIM / 2-SAIR]: ");
            opcao = ler.nextInt();

            int contador = 0;
            for (Produto key : Produto.getListaProdutos().values()){

                if (key.getEstoque()== 0){
                    contador++;


                }

            }
            if (contador == 10){
                novo.repoeEstoque();
                System.out.println("Estoque renovado");
            }

        }while (opcao == 1);


        System.out.println("Fim do Programa");


    }

}