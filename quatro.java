import java.util.Scanner;
public class quatro {
    public static void main(String[] args) {
        int cont=0 ,idade,sexo,temperamento, individuos=3,calmas=0,mulherNervosas=0, homensAgressivos = 0, outrosCalmos=0,
        nervosa40=0, calmas18=0;
        
        Scanner ler = new Scanner(System.in);

        while (cont < individuos) {
            cont++;
            System.out.print("Escreva sua idade:");
            idade = ler.nextInt();
            
            System.out.println("Informe seu sexo:");
            System.out.println("Digite 1 - Masculino");
            System.out.println("Digite 2 - Feminino");
            System.out.println("Digite 3 - Outros");
            sexo = ler.nextInt();
            
            System.out.println("Você se considera uma pessoa:");
            System.out.println("Digite 1 - Calma");
            System.out.println("Digite 2 - Nervosa");
            System.out.println("Digite 3 - Agresiva");
            temperamento = ler.nextInt();

            if (temperamento == 1) {
                calmas++;
            }
            
            if (sexo == 2 && temperamento == 2){
                mulherNervosas++;
            }
            
            if (sexo == 1 && temperamento == 3){
                homensAgressivos++;
            }
            
            if (sexo == 3 && temperamento == 1){
                outrosCalmos++;
            }
            
            if (idade > 40 && temperamento == 2){
                nervosa40++;
            }
            
            if (idade < 18 && temperamento == 1){
                calmas18++;
            }
             
        }
        System.out.printf("\no número de pessoas calmas é %d",calmas);
        System.out.printf("\no número de mulheres nervosas é %d",mulherNervosas);
        System.out.printf("\no número de homens agressivos é %d",homensAgressivos);
        System.out.printf("\no número de outros calmos é %d",outrosCalmos);
        System.out.printf("\no número de pessoas nervosas com mais de 40 anos é %d",nervosa40);
        System.out.printf("\no número de pessoas calmas com menos de 18 anos é %d",calmas18);

    }
}
