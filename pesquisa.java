import java.util.Scanner;
public class pesquisa {
    public static void main(String[] args) {
        double salario = 0, somaSalario=0.00,  maiorSalario = 0.00, contador = 0.00, participantes = 3.00, filhos, somaFilhos = 0.00 ;
        Scanner ler = new Scanner(System.in);
        for(int x = 0;x < 3;x++){
            System.out.print("Escreva seu salario:");  
            salario = ler.nextInt(); 
            System.out.print("Escreva a quantidade de filhos:");  
            filhos = ler.nextInt();
            
            somaSalario = somaSalario + salario;
            somaFilhos = somaFilhos + filhos;
            
           
            if (salario >= salario) {
                
               maiorSalario = salario;
            }

            if (salario < 101) {
                
                contador++;
            }

        }
        
        System.out.printf("\nO maior Salario é %.2f",maiorSalario);
        System.out.printf("\nA soma dos  Salarios é %.2f",(somaSalario));
        System.out.printf("\nA media dos  Salarios é %.2f",(somaSalario/participantes));
        System.out.printf("\nA media dos  Filhos é %.2f",(somaFilhos/participantes));
        System.out.printf("\n%.2f  tem salario até R$100.00",((contador/participantes)*100));
        
    }
}
