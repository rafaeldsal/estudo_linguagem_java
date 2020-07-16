package com.rafael.devcursojava.exercicios;

/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
sal�rio bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o sal�rio l�quido.
calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
+ Sal�rio Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Sal�rio Liquido : R$
*/

import java.util.Scanner;

public class Ex14{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- SALARIO M�S COM DESCONTOS ---\n");

		System.out.print("Entre com o sal�rio hora: ");
		double salarioHora = scan.nextDouble();
		System.out.print("Entre com as horas trabalhadas no m�s: ");
		int horasTrabalhadas = scan.nextInt();

		double salarioBruto = salarioHora * horasTrabalhadas;
		double impostoRenda = (salarioBruto / 100) * 11;
		double descontoInss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double totalDesconto = impostoRenda + descontoInss + sindicato;
		double salarioLiquido = salarioBruto - totalDesconto;

		System.out.println("Sal�rio Bruto: " + salarioBruto);
		System.out.println("Imposto de Renda (11%): " + impostoRenda);
		System.out.println("Desconto INSS (8%): " + descontoInss);
		System.out.println("Sindicato (5%): " + sindicato);
		System.out.println("Total de descontos: " + totalDesconto);
		System.out.println("Sal�rio Liquido: " + salarioLiquido);
	}
}