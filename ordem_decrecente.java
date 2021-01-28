import java.util.Scanner;
public class ordem_decrecente {
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
                
                if (n2 > n3) {

                    System.out.printf("%d,%d,%d", n1 , n2 , n3);  
                }
                else {
                    System.out.printf("%d,%d,%d",n1 , n3 , n1);
                } 
            }
        }
        else {
            if (n2 > n3 ) {
                if (n3 > n1) {
                    System.out.printf("%d,%d,%d",n2,n3, n1);   
                }
                else {
                    System.out.printf("%d,%d,%d",n2 , n1 , n3);

                }

            }
            else {
                
                if (n2 > n1) {
                    System.out.printf("%d,%d,%d",n3 , n2 , n1);
                    
                }
                else {
                    System.out.printf("%d,%d,%d",n3 , n1 , n2);
                }
            }
        }

            
        
    }
}
