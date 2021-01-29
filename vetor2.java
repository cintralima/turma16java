import java.util.Scanner;
public class vetor2 {
    public static void main(String[] args) {
        int vetor[] = new int[3], maior=0,cont=0,soma=0;
        Scanner ler = new Scanner(System.in);
        
        for (int i = 0; i < vetor.length; i++) {
    
            System.out.print("Escreva um numero:");
            vetor[i] = ler.nextInt();
            soma = soma + vetor[i];
        }
        
        for (int i = 0; i < vetor.length; i++) {
    
            System.out.print(vetor[i]+",");
            
        }
    
        for (int i = 0; i < vetor.length;i++) {
    
            if ( vetor[i] >= maior ) {
                cont++;

                
                if ( vetor[i] > maior ) {
                    cont = 0;
                    cont++;            
                }
                
                maior = vetor[i];
                           
            }
           
            
        }
    
        System.out.printf("\nA Media dos valores é %d",(soma/vetor.length));
        System.out.printf("\nO maior valor é %d e ele apareceu %d vezes",(maior),cont);
            
    }
        
}
    
    

