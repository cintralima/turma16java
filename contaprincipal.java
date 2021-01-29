import java.util.Scanner;
public class contaprincipal {

    public static void contaespecial() {
        Scanner leia = new Scanner(System.in);
		
		int limite = 1000, movimento, continua;
		double valorDeb, valorCred, saldoAtualdeb, saldoAtualcred;
		String descricao;
		
		System.out.println("Bem-Vindo à sua Conta Especial");	
		System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
		movimento = leia.nextInt();
		
		
		if(movimento == 1) {
			System.out.print("\nDESEJA USAR O SEU LIMITE DE 1000R$? SE SIM, QUANTO?: ");
			limite = leia.nextInt();
		if(limite >1000) {
			System.out.print("O seu limite é de 1000,00R$. Por favor, digite outro valor!: ");
			limite = leia.nextInt();
		}
			System.out.print("\nDigite o valor que deseja debitar: ");
			valorDeb = leia.nextDouble();
			System.out.print("\nDescreva o que gostaria de fazer: ");
			descricao = leia.next();
			saldoAtualdeb = limite - valorDeb;
			System.out.printf("\nSeu saldo é de: "+saldoAtualdeb);
			System.out.print("\nContinua: [3]sim ou [4]não?: ");
			continua = leia.nextInt();
		if(continua == 3) {
			System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
			movimento = leia.nextInt();
		}
		}
		
		
		if(movimento == 2) {
			System.out.print("\nDigite o valor que deseja creditar: ");
			valorCred = leia.nextDouble();
			saldoAtualcred = valorCred;
			System.out.printf("\nSeu saldo é de: "+saldoAtualcred);
			System.out.print("\nContinua: [3]sim ou [4]não?: ");
			continua = leia.nextInt();
		if(continua == 4) {
			System.out.print("\nObrigadx pela transição! ");
		}
		if(continua == 3) {
			System.out.print("\nSELECIONE O MOVIMENTO - 1(débito)/2(crédito): ");
			movimento = leia.nextInt();
		}
		}
	}
  
    public static void contaempresarial() {



        Scanner ler= new Scanner (System.in); 
		double saldo=0, valor=0,valorEmprestimo=0, valorEmprestimoI=10000;
		int movimento,continua=0, opEmprestimolDecidir;
		String descricao;
		
		
		
		do
			{
			System.out.println("\t\t\t\t\tBEM VINDO A CONTA EMPRESARIAL\n");
			System.out.println("SELECIONE UM MOVIMENTO 1- debito/ 2-credito:");
			movimento=ler.nextInt();
				if(movimento==1) 
				{
					System.out.println("SALDO ATUAL: "+saldo);
					System.out.println("VALOR DA OPERAÇÃO: ");
					valor = ler.nextDouble();
					System.out.println("DESCRIÇÃO DA OPERAÇÃO: ");
					descricao = ler.next();
					
					saldo=saldo-valor;
					if(saldo<0) 
					{
						System.out.println("Prezado cliente, seu saldo não é suficiente para essa operação");
						System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - NÃO ");
						opEmprestimolDecidir = ler.nextInt();
						
						if(opEmprestimolDecidir==1)
						{
							System.out.println("Digite valor do emprestimo: ");
							valorEmprestimo= ler.nextDouble();
							saldo=+valorEmprestimo;
							valorEmprestimoI=valorEmprestimoI-valorEmprestimo;
							System.out.println("NOVO SALDO: "+saldo);
							System.out.println("VALOR DISPONIVEL PARA EMPRESTIMO: "+valorEmprestimoI);
							System.out.println("Fazer nova transação? 1- sim/ 2- não");
							continua = ler.nextInt();
						}
						else if(opEmprestimolDecidir==2)
						{
							System.out.println("Fazer nova transação? 1- sim/ 2- não");
							continua = ler.nextInt();
						}
						else
						{
							System.out.println("Decisão não identificada.");
							System.out.println("Deseja fazer um emprestimo? 1 - SIM/ 2 - NÃO ");
							opEmprestimolDecidir = ler.nextInt();
							if(opEmprestimolDecidir==2)
							{
								System.out.println("Fazer nova transação? 1- sim/ 2- não");
								continua = ler.nextInt();
							}
						}
					}
					else
					{
						System.out.println("NOVO SALDO: "+saldo);
					}
					
					
				}
				else if (movimento==2)
				{
					System.out.println("SALDO ATUAL: "+saldo);
					System.out.println("VALOR DA OPERAÇÃO: ");
					valor = ler.nextDouble();
					System.out.println("DESCRIÇÃO DA OPERAÇÃO: ");
					descricao = ler.next();
					
					saldo=saldo+valor;
					
					System.out.println("NOVO SALDO: "+saldo);
					System.out.println("Fazer nova transação? 1- sim/ 2- não");
					continua = ler.nextInt();
				}
				else 
				{
					System.out.println("Operação não identificada.");
				}
			}
		while(continua==1);
        
    }
    public static void contaestundatil() {
        Scanner leia = new Scanner (System.in); 
		double saldo=0, valor=0,valorLimite=0, valorLimite1=5000;
		int movimento,continua=0, limiteDecidir;
		String descricao;


			System.out.println("\t\t\t\t\tBem vindo à sua Conta Especial!"+"\n");
			System.out.println("Selecione o movimento [1/2]: \n 1 - Debito \n 2 - Crédito");
			movimento=leia.nextInt();
				if(movimento==1) 
				{
					System.out.println("Saldo atual em conta: "+saldo);
					System.out.println("Valor para saque: ");
					valor = leia.nextDouble();
					System.out.println("Descrição (Finalidade): "+"\n");
					descricao = leia.next();

					saldo=saldo-valor;
				if(saldo<0) 
					{
						System.out.println("Verificado em conta que saldo encontra-se negativo!");
						System.out.println("Deseja solicitar limite estudantil? \n 1 - Sim \n 2 - Não");
						limiteDecidir = leia.nextInt();

						if(limiteDecidir==1)
						{
							System.out.println("Digite um valor para o limite estudantil: ");
							valorLimite= leia.nextDouble();
							saldo=+valorLimite;
							valorLimite1=valorLimite1-valorLimite;
							System.out.println("Saldo atual em conta: "+saldo);
							System.out.println("Valor restante do limite estudantil para uso: "+valorLimite1);
						
						}
						else if(limiteDecidir==2)
						{
							System.out.println("Sessão encerrada");
							continua = leia.nextInt();
						}
					}
					
            } 
            else if (movimento == 2) {
				System.out.println("Saldo atual em conta: "+saldo);
				System.out.println("Valor para saque: ");
				valor = leia.nextDouble();
				System.out.println("Descrição (Finalidade): "+"\n");
				descricao = leia.next();

				saldo=saldo-valor;
            } 
            if(saldo<0)
			{
				System.out.println("Verificado em conta que saldo encontra-se negativo!");
				System.out.println("Deseja solicitar limite estudantil? \n 1 - Sim \n 2 - Não");
				limiteDecidir = leia.nextInt();

				if(limiteDecidir==1)
				{
					System.out.println("Digite um valor para o limite estudantil: ");
					valorLimite= leia.nextDouble();
					saldo=+valorLimite;
					valorLimite1=valorLimite1-valorLimite;
					System.out.println("Saldo atual em conta: "+saldo);
					System.out.println("Valor restante do limite estudantil para uso: "+valorLimite1);
				
				}
				else if(limiteDecidir==2)
				{
					System.out.println("Sessão encerrada");
					continua = leia.nextInt();
					
                }
            }
        }   
    
    public static void contacorrente() {
    
       

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
        System.out.println("Digite 4 - Conta Especial");
        System.out.println("Digite 5 - Conta Estudantil");
        opcao = ler.nextInt(); 
        
        if (opcao == 1) {
            contacorrente();
        }
        if (opcao == 5) {
            contaestundatil();
        }
        if (opcao == 3) {
            contaempresarial();
        }
        if (opcao == 4) {
            contaespecial();
        }
         
         
    }   
}