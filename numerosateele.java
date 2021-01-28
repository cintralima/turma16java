import java.util.Scanner;
public class numerosateele {
    public static void main(String[] args) {
        int numero, contador = 0, somaNumero=0;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Escreva um numero:");  
        numero = ler.nextInt(); 
        
        while(contador < numero){        
            contador++;
            somaNumero = somaNumero + contador;
        }
        System.out.print(somaNumero);
    }
}
