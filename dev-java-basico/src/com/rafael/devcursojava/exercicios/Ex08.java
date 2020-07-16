package com.rafael.devcursojava.exercicios;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Ex08{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- CALCULO DE SALARIO MENSAL ---\n\n");

		System.out.print("Informe quanto ganha por hora trabalhada: ");
		double valorHora = scan.nextDouble();
		System.out.print("Informe as horas trabalhadas no mês: ");
		int horaTrabalhada = scan.nextInt();

		double salario = valorHora * horaTrabalhada;
		

		System.out.println("O salário é de " + salario);
	}
}