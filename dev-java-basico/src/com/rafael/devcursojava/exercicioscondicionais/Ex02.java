package com.rafael.devcursojava.exercicioscondicionais;

//Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O primeiro n�mero informado � maior que o segundo.");
		} else {
			System.out.println("O segundo n�mero informado � maior que o primeiro.");
		}
	}
}
