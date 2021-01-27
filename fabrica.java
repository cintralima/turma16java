import java.util.Scanner;
public class fabrica {
    public static void main(String[] args) {
    int segundosEvento , horas, minutos, segundos ;
    Scanner ler = new Scanner(System.in); 
    System.out.print("Escreva os segundo do evento:");  
    segundosEvento = ler.nextInt();
    horas =  segundosEvento / 3600 ;
    minutos = (segundosEvento % 3600) / 60 ; 
    segundos = (segundosEvento % 3600) % 60;
    System.out.println("A duração da sua tarefa é "+ horas + " horas " +minutos+ " minutos e " +segundos+ " segundos.");
        
    }
}
