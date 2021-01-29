import java.util.Scanner;
public class contacorrente {
    public static void main(String[] args) {
        double saldo= 0.00, valor=0.00;
        String  descricao ="";
        int opcao2=0 , opcao = 0, talao = 3;
        Scanner ler = new Scanner(System.in);
        
       do {
            System.out.println("\nBem vindo a sua Conta Corrente");
            
            if (talao>0) {
                
                System.out.printf("\nVocê tem %d taloês disponiveis, deseja solicitar?:",talao);
                System.out.println("\nDigite 1 - Sim");
                System.out.println("Digite 2 - Não");
                opcao = ler.nextInt();
                
            }
            
            if(opcao == 1){
                talao = talao -1;


            }

            if (talao <=0) {

                System.out.println("---------------------------------------");
                System.out.println("Você não possui mais talôes disponiveis");
                System.out.println("---------------------------------------");
            }

            System.out.println("Deseja fazer uma transação");
            System.out.println("Digite 1 - Sim");
            System.out.println("Digite 2 - Não");
            opcao2 = ler.nextInt();
         
            if (opcao2 == 1) {
            System.out.println("Você deseja creditar ou debitar?");
            System.out.println("Digite 1 - Creditar");
            System.out.println("Digite 2 - Debitar");
            opcao = ler.nextInt();
             
                if (opcao == 1) {
                    System.out.println("Digite o valor");
                    valor = ler.nextInt();
                    System.out.println("Digite a descrição");
                    descricao = ler.next();
                    saldo = saldo + valor;
                    System.out.print("\nTransação realizada com sucesso");
                    System.out.print("\n---------------------------------------");
                    System.out.printf("\nO saldo atual da sua conta é R$%.2f",saldo);
                    System.out.print("\n---------------------------------------");
  

    
                }
                else{

                    if (saldo <= 0) {
                        System.out.println("---------------------------------------");
                        System.out.println("\nVocê não tem saldo para essa transação");
                        System.out.println("---------------------------------------");
                        
                    }
                    else{

                        System.out.println("Digite o valor");
                        valor = ler.nextInt();
                        System.out.println("Digite a descrição");
                        descricao = ler.next();
                        

                        if ((saldo - valor) < 0 ) {
                            System.out.println("---------------------------------------");
                            System.out.println("Você não tem saldo para essa transação");
                            System.out.println("---------------------------------------");
                        }
                        else{
                            saldo = saldo - valor;
                            System.out.print("\nTransação realizada com sucesso");
                            System.out.println("---------------------------------------");                           
                            System.out.printf("O saldo atual da sua conta é R$%.2f",saldo);
                            System.out.println("---------------------------------------");
                        }  
                    }
                    
                }    
           }
           else{
            System.out.printf("O saldo atual da sua conta é R$%.2f",saldo);
  
           }          

        } while (opcao2 != 2);


    }
        
    
}
