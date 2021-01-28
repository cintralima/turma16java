import java.util.Scanner;
import java.lang.Math;
public class parouimpar {
    public static void main(String[] args) {
        double numero, raiz;
        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva sua numero:");  
        numero = ler.nextInt(); 
        if (numero%2 == 0) {
        
         raiz = Math.sqrt(numero);
         
        System.out.printf("O %.2f é par, e sua raiz é %.2f", numero, raiz );    
        }
        else {
            System.out.printf("O %.2f é impar, e elevado ao quadrado é %.2f", numero, (numero*numero) );
            
        }        
    }
}
