import java.util.Scanner;
public class cinco {
    public static void main(String[] args) {
    int numero, soma=0 ;
    Scanner ler = new Scanner(System.in);

    do {
    System.out.print("Escreva um numero:");
    numero = ler.nextInt();
    soma = soma + numero;
        
    } while (numero != 0);

    System.out.printf("A soma dos numeros digitados é %d",soma);

    }
    
}
