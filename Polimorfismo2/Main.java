package Polimorfismo2;

public class Main {
    public static void main(String[] args) {
        Empregado emprega1 = new Empregado("Léo",26);
        emprega1.setHoras(10);
        emprega1.setValorHoras(10);

        Terceiro terceiro1 = new Terceiro("Léo",26,1.1);
        terceiro1.setHoras(10);
        terceiro1.setValorHoras(10);

        System.out.println(emprega1.salario());
        System.out.println(terceiro1.salario());



    }
}
