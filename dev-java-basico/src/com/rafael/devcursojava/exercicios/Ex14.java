package com.rafael.devcursojava.exercicios;

/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
*/

import java.util.Scanner;

public class Ex14{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- SALARIO MÊS COM DESCONTOS ---\n");

		System.out.print("Entre com o salário hora: ");
		double salarioHora = scan.nextDouble();
		System.out.print("Entre com as horas trabalhadas no mês: ");
		int horasTrabalhadas = scan.nextInt();

		double salarioBruto = salarioHora * horasTrabalhadas;
		double impostoRenda = (salarioBruto / 100) * 11;
		double descontoInss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double totalDesconto = impostoRenda + descontoInss + sindicato;
		double salarioLiquido = salarioBruto - totalDesconto;

		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Imposto de Renda (11%): " + impostoRenda);
		System.out.println("Desconto INSS (8%): " + descontoInss);
		System.out.println("Sindicato (5%): " + sindicato);
		System.out.println("Total de descontos: " + totalDesconto);
		System.out.println("Salário Liquido: " + salarioLiquido);
	}
}