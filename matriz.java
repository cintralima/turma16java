import java.util.Scanner; 
import java.util.Random;
public class matriz {
    public static void main(String[] args) {
        int n1[][] = new int[4][6], n2[][] = new int[4][6], m1[][] = new int[4][6], m2[][] = new int[4][6];
        Scanner ler = new Scanner(System.in);
        Random sorteia = new Random();

        for (int linhas = 0; linhas < 4; linhas++) {
            
            for (int colunas = 0; colunas < 6; colunas++) {
                
                n1[linhas][colunas] = sorteia.nextInt(10);
            
            }
            
        }

        for (int linhas = 0; linhas < 4; linhas++) {
            
            for (int colunas = 0; colunas < 6; colunas++) {
                
                n2[linhas][colunas] = sorteia.nextInt(10);
            
            }
            
        }

        for (int linhas = 0; linhas < 4; linhas++) {
            
            for (int colunas = 0; colunas < 6; colunas++) {
                
                m1[linhas][colunas] = n1[linhas][colunas] + n2[linhas][colunas];
            
            }
            
        }

        for (int linhas = 0; linhas < 4; linhas++) {
            
            for (int colunas = 0; colunas < 6; colunas++) {
                
                m2[linhas][colunas] = n1[linhas][colunas] - n2[linhas][colunas];
            
            }
            
        }

        for (int linhas = 0; linhas < 4; linhas++) {
            
            for (int colunas = 0; colunas < 6; colunas++) {
                System.out.print("\n====M1====");
                System.out.print("|"+ m1[linhas][colunas]+"|");
            
            }
            
            System.out.print("\n");
        }

        for (int linhas = 0; linhas < 4; linhas++) {
            
            for (int colunas = 0; colunas < 6; colunas++) {
                System.out.print("\n====M2====");
                System.out.print("|"+ m2[linhas][colunas]+"|");
            
            }
            
            System.out.print("\n");
        }
        
        
    }
}
