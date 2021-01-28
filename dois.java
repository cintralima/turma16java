import java.util.Scanner;
public class dois {
    public static void main(String[] args) {
        int numero,somaPar=0,somaImpar=0;
        
        Scanner ler = new Scanner(System.in);
        
        for(int x = 0; x < 10 ;x++){
            System.out.print("Digite um numero:");  
            numero = ler.nextInt(); 
            
            if ( numero % 2 == 0 ){
            somaPar++;
   
            }
            else{
                somaImpar++;
            }

        }
        System.out.printf("Você digitou %d pares e %d impares.",somaPar,somaImpar); 

    }
}