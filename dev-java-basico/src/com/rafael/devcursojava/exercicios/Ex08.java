package com.rafael.devcursojava.exercicios;

//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.

import java.util.Scanner;

public class Ex08{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- CALCULO DE SALARIO MENSAL ---\n\n");

		System.out.print("Informe quanto ganha por hora trabalhada: ");
		double valorHora = scan.nextDouble();
		System.out.print("Informe as horas trabalhadas no m�s: ");
		int horaTrabalhada = scan.nextInt();

		double salario = valorHora * horaTrabalhada;
		

		System.out.println("O sal�rio � de " + salario);
	}
}