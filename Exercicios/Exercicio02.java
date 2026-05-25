package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu código de funcinário: ");
        int codigofuncionario = scanner.nextInt();

        System.out.println("Digite seu salário: ");
        int salario = scanner.nextInt();

        System.out.println("Digite quanto tempo você tem de serviço: ");
        int temposervico = scanner.nextInt();

        System.out.println("Digite seu sexo, true para homem e false para mulher: ");
        boolean sexo = scanner.nextBoolean();

        double bonus = 0;

        if (sexo == true && temposervico > 15) {
            bonus = salario * 0.20;
        } else if (sexo == false && temposervico > 10) {
            bonus = salario * 0.25;
        } else {
            bonus = 100;
        }

        System.out.println("Seu código: " + codigofuncionario);

        System.out.println("Seu bônus: R$ " + bonus);

        scanner.close();
    }
}