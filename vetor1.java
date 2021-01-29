import java.util.Scanner;
public class vetor1 {

    public static void main(String[] args) {
    int vetor[] = new int[5], maior=0;
    Scanner ler = new Scanner(System.in);
    
    for (int i = 0; i < vetor.length; i++) {

        System.out.print("Escreva um numero:");
        vetor[i] = ler.nextInt(); 
    }
    
    for (int i = 0; i < vetor.length; i++) {

        System.out.print(vetor[i]+",");
        
    }

    for (int i = 0; i < vetor.length;i++) {

        if ( vetor[i] > maior ) {

          maior = vetor[i];           
        }
        
    }

    System.out.printf("\nO maior valor é %d",maior);
        
    }
    
}
