package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nomefuncionario = scanner.nextLine();

        System.out.println("Digite quantas horas foram trabalhadas: ");
        int horastrabalhadas = scanner.nextInt();

        System.out.println("Digite sua idade: ");
        int idadefuncionario = scanner.nextInt();

        System.out.println("Digite quantos filhos menores de 14 anos você tem: ");
        int filhos = scanner.nextInt();

        System.out.println("Digite quanto tempo você tem de serviço: ");
        int temposervico = scanner.nextInt();

        System.out.println("Digite o valor por hora trabalhada: ");
        double valorporhora = scanner.nextDouble();

        System.out.println("Digite o valor por filho: ");
        double valorfilho = scanner.nextDouble();

        double salariobruto = valorporhora * horastrabalhadas;

        double descontoinps = salariobruto * 0.085;

        double salariofamilia = filhos * valorfilho;

        double impostorenda;

        if (salariobruto > 1500) {
            impostorenda = salariobruto * 0.15;

        } else if (salariobruto >= 500 && salariobruto <= 1500) {
            impostorenda = salariobruto * 0.08;

        } else {
            impostorenda = 0;
        }

        double adicional = 0;

        if (idadefuncionario > 40) {
            adicional = salariobruto * 0.02;

        } else if (temposervico > 15) {
            adicional = salariobruto * 0.035;

        } else if (temposervico > 5 && temposervico <= 15 && idadefuncionario > 30) {
            adicional = salariobruto * 0.015;
        }

        double totaldescontos = descontoinps + impostorenda;

        double salarioliquido = salariobruto + salariofamilia + adicional - totaldescontos;

        System.out.println("Funcionário: " + nomefuncionario);
        System.out.println("Salário Bruto: R$ " + salariobruto);
        System.out.println("Desconto INPS: R$ " + descontoinps);
        System.out.println("Imposto de Renda: R$ " + impostorenda);
        System.out.println("Salário Família: R$ " + salariofamilia);
        System.out.println("Adicional: R$ " + adicional);
        System.out.println("Total de Descontos: R$ " + totaldescontos);
        System.out.println("Salário Líquido: R$ " + salarioliquido);

        scanner.close();
    }
}