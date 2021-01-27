import java.util.Scanner;
public class tres {
    public static void main(String[] args) {
    int anosDias , anos, mes, dias ;
    Scanner ler = new Scanner(System.in); 
    System.out.print("Escreva sua idade em dias:");  
    dias = ler.nextInt();
    anos =  dias / 365 ;
    mes = (dias % 365) / 30 ; 
    anosDias = (dias % 365) % 30;
    System.out.println("A sua idade é "+anos + " anos " +mes+ " mês e " +anosDias+ " dias.");

    }
}