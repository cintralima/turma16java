import java.util.Scanner;
public class campeonato {
    public static void main(String[] args) {
        
        String times[] = {"PALMEIRAS","SÃO PAULO","CORITHIANS","SANTOS"};
        int pontos[] = {0,0,0,0}, digita = 0 , tabela[]= {0,0,0}, maior = 0,maior2=0,maior3= 0, indiceMaior = 0, indiceMaior2 = 0;
        Scanner ler = new Scanner(System.in);


        System.out.print("\nCAMPEONATO PAULISTA");
        System.out.print("\n--------------------");

        

    for (int rodada = 0; rodada < 4 ; rodada++) {
        
        System.out.printf("\nRODADA %d",rodada+1);

        for (int time = 0; time < 4; time++) {
        
            System.out.print("\n--------------------");
            System.out.printf("\nO %s: ",times[time]);
            System.out.print("\nDigite 1 - GANHOU");
            System.out.print("\nDigite 2 - PERDOU");
            System.out.print("\nDigite 3 - EMPATOU:");
            digita = ler.nextInt();
    
            if (digita == 1) {

                if ( times[time] == "PALMEIRAS" ) {
                    pontos[0] = pontos[0] + 3;
                }
                if ( times[time] == "SÃO PAULO" ) {
                    pontos[1] = pontos[1] + 3;
                }
                if ( times[time] == "CORITHIANS" ) {
                    pontos[2] = pontos[2] + 3;
                }
                if ( times[time] == "SANTOS" ) {
                    pontos[3] = pontos[3] + 3;
                }
                
            }

            if (digita == 3) {
    
                if ( times[time] == "PALMEIRAS" ) {
                    pontos[0] = pontos[0] + 1;
                }
                if ( times[time] == "SÃO PAULO" ) {
                    pontos[1] = pontos[1] + 1;
                }
                if ( times[time] == "CORITHIANS" ) {
                    pontos[2] = pontos[2] + 1;
                }
                if ( times[time] == "SANTOS" ) {
                    pontos[3] = pontos[3] + 1;
                }
                
            }
            if (digita == 2) {
    
                tabela[1]++;
                
            }
            
            
        }   

    }
    System.out.print("\n------------------------------");
    System.out.print("\nCLASSIFICAÇÃO DO CAMPEONATO");
    System.out.print("\n-----------------------------");
    System.out.print("\nTime\t\tPontos\t");
    
    
    

    for (int i = 0; i < pontos.length;i++) {

        if ( pontos[i] > maior ) {

          maior = pontos[i];
          indiceMaior = i ;
            
        }
        
    }

    System.out.printf("\n%s \t%d\t",times[indiceMaior],maior);

    for (int i = 0; i < 4 ;i++) {
        if ( pontos[i] != maior ) {

            
             if ( pontos[i] > maior2 ) {

                maior2 = pontos[i];
                indiceMaior2 = i ;
              
            }

         }

    }
    System.out.printf("\n%s \t%d\t",times[indiceMaior2],maior2);
    


   


    
    

        
        
    }
}
