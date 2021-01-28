import java.util.Scanner;
public class seis {
    public static void main(String[] args) {
        int numero, soma=0, cont=0 ;
        Scanner ler = new Scanner(System.in);

        do {
        System.out.print("Escreva um numero:");
        numero = ler.nextInt();
       
            if (numero % 3 == 0 && numero > 0) {
            soma = soma + numero;
            cont++; 
            
            }
        
        } while (numero != 0);

        System.out.printf("A media dos numeros mutiplos de TRÊS digitados é %d",(soma/cont));

    }
    
}
