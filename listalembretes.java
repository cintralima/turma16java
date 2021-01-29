import java.util.Scanner;
public class listalembretes {
    
    public static void main(String[] args) {
    String lista[][] = new String[24][31], lembrete="";
    Scanner ler = new Scanner(System.in);
    int hora= 0,dia=0, opcao=0;
    
    do {
    System.out.print("Escolha uma hora:");
    hora = ler.nextInt();
    System.out.print("Escolha um dia:");
    dia = ler.nextInt();
    System.out.print("Escreva sua mensagem:");
    lembrete = ler.next();
    System.out.print("\nDeseja escreva mais uma nota");
    System.out.print("\nDigite 1 - SIM");
    System.out.print("\nDigite 2 - Não");
    opcao = ler.nextInt();

    lista[hora][dia] = lembrete;

    if (opcao == 2) {

        break;
        
    }

    } while(true);

    for (int h = 1; h < 24; h++) {
            
        for (int d = 1; d < 31; d++) {
             System.out.println(lista[h][d]);
            
        
        }
        System.out.print("\n");    
    }   

    
}

}

