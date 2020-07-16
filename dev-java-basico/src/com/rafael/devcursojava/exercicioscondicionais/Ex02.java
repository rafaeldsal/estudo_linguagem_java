package com.rafael.devcursojava.exercicioscondicionais;

//Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O primeiro número informado é maior que o segundo.");
		} else {
			System.out.println("O segundo número informado é maior que o primeiro.");
		}
	}
}
