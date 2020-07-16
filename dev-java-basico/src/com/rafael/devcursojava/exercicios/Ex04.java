package com.rafael.devcursojava.exercicios;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Ex04{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- MEDIA ANUAL DE UM ALUNO ---");

		System.out.print("Informe a nota do primeiro bimestre: ");
		double n1 = scan.nextDouble();
		System.out.print("Informe a nota do Segundo Bimestre: ");
		double n2 = scan.nextDouble();
		System.out.print("Informe a nota do Terceiro Bimestre: ");
		double n3 = scan.nextDouble();
		System.out.print("Informe a nota do Quarto Bimestre: ");
		double n4 = scan.nextDouble();

		double media = (n1 + n2 + n3 + n4) / 4;

		System.out.println("A média é: " + media);
		
	}
}