import java.util.Scanner;
public class categoria {
    public static void main(String[] args) {
        int idade;
        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva sua idade:");  
        idade = ler.nextInt(); 
        
        if (idade < 10 ) {
            System.out.print("Não temos essa categoria");
        }
        else if (idade < 15){
            System.out.print("Você está na categoria Infantil");
        }
        else if (idade < 18){
            System.out.print("Você está na categoria Juvenil");
        }
        else if (idade < 25){
            System.out.print("Você está na categoria Adulto");
        }
        else {
           
            System.out.print("Não temos essa categoria");
        }
        
    }
    
}
