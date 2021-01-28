import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva um numero:");  
        n1 = ler.nextInt(); 
        System.out.print("Escreva um numero:");  
        n2 = ler.nextInt(); 
        System.out.print("Escreva um numero:");  
        n3 = ler.nextInt(); 

        if (n1 > n2 ) {

            if (n1 > n3) {
                System.out.print("O maior numero é " + n1 );  
                
            }
            else {
                System.out.print("O maior numero é " + n3 );
            }

        }
        else if (n2 > n3){
            
            if (n2 > n1) {
                System.out.print("O maior numero é " + n2 );
                
            }
            else {
                System.out.print("O maior numero é " + n1 );
            }

        }
        else if (n3 > n1){
            
            if (n3 > n2) {
                System.out.print("O maior numero é " + n3 );
                
            }
            else {
                System.out.print("O maior numero é " + n2 );
            }

        }
            
     }
     
 }

    
