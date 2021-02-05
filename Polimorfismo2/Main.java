package Polimorfismo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matricula, horas, valorHoras;
        double acrescimo;
        String nome;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = ler.next();
        System.out.println("Digite sua matricula:");
        matricula = ler.nextInt();
        System.out.println("Horas trabalhadas:");
        horas = ler.nextInt();
        System.out.println("Valor da Hora:");
        valorHoras = ler.nextInt();

        System.out.println("É TERCERIZADO?\n Digite 1- SIM\n Digite 2 - NÃO");
        int opcao = ler.nextInt();

        if (opcao == 2) {

            Empregado novoEmpregado = new Empregado(nome, matricula, horas, valorHoras);
            System.out.println(novoEmpregado);
            System.out.println(novoEmpregado.salario());

        } else {

            System.out.println("Digite o valor do acrescimo:");
            acrescimo = ler.nextDouble();

            Terceiro novoEmpregado = new Terceiro(nome, matricula, horas, valorHoras, acrescimo);

            System.out.println(novoEmpregado);
            System.out.println(novoEmpregado.salario());

        }

    }
}
