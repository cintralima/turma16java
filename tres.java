import java.util.Scanner;
public class tres {
    public static void main(String[] args) {
        int idade=0,cont21=0,cont50=0;
        
        Scanner ler = new Scanner(System.in);

        while (idade != -99) {
            System.out.print("Digite sua idade:");  
            idade = ler.nextInt(); 

            if (idade < 21) {
                cont21++;
                
            }
            else if (idade > 50){
                cont50++;

            }
            
        }
        System.out.printf("%d pessoas tem menos de 21 anos",cont21);
        System.out.printf("\n%d pessoas tem mais de 50 anos",cont50);
    }
}
