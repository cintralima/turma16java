import java.util.Scanner;
public class idade {

    public static void main(String[] args) {
    int idadeAno, mes , dias , somaDias ; 
    Scanner ler = new Scanner(System.in); 
    System.out.print("Escreva sua idade\n"); 
    System.out.print("Anos:");  
    idadeAno = ler.nextInt();
    System.out.print("Meses:");  
    mes = ler.nextInt();
    System.out.print("Dias:");  
    dias = ler.nextInt();
    somaDias = (idadeAno * 365) + (mes * 30) + dias;
    System.out.println(somaDias);
        
    }
    
}
