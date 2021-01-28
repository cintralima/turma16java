import java.util.Scanner;
public class contaprincipal {
    
    public static void contacorrente() {

        double saldo= 0.00, valor=0.00;
        String  descricao ="";
        int opcao2=0 , opcao = 0, talao = 3;
        Scanner ler = new Scanner(System.in);
        
       do {
            System.out.println("Bem vindo a sua Conta Corrente");
            
        
            System.out.printf("\nVocê tem %d taloês disponiveis, deseja solicitar?:",talao);
            System.out.println("\nDigite 1 - Sim");
            System.out.println("Digite 2 - Não");
            opcao = ler.nextInt();
           

            if(opcao == 1){
                talao = talao -1;


            }

            if (talao == 0) {

                System.out.println("Você não possui mais talôes disponiveis");
            }

            System.out.println("Deseja fazer uma transação");
            System.out.println("Digite 1 - Sim");
            System.out.println("Digite 2 - Não");
            opcao2 = ler.nextInt();
         
            if (opcao2 == 1) {
            System.out.println("Debito ou Credito");
            System.out.println("Digite 1 - Credito");
            System.out.println("Digite 2 - Debito");
            opcao = ler.nextInt();
             
                if (opcao == 1) {
                    System.out.println("Digite o valor");
                    valor = ler.nextInt();
                    System.out.println("Digite a descrição");
                    descricao = ler.next();
                    saldo = saldo + valor;
    
                }
                else{
                    System.out.println("Digite o valor");
                    valor = ler.nextInt();
                    System.out.println("Digite a descrição");
                    saldo = saldo - valor;
                }    
           }
           else{
            System.out.printf("O saldo atual da sua conta é R$%.2f",saldo);
            
  
           }          

        } while (opcao2 != 2);

    }
    
    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco Generation");
        System.out.println("----------------------------");
        System.out.println("Escolha um tipo de conta");
        System.out.println("----------------------------");
        System.out.println("Digite 1 - Conta Corrente");
        System.out.println("Digite 2 - Conta Poupança");
        System.out.println("Digite 3 - Conta Empresarial");
        System.out.println("Digite 2 - Conta Estudantil");
        opcao = ler.nextInt(); 
        
        if (opcao == 1) {
            contacorrente();
        }
         
    }   
}