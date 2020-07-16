package com.rafael.devcursojava.exercicioscondicionais;

//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com valor do produto de determinada loja: ");
		double valor1 = scan.nextDouble();
		System.out.print("Entre com outro valor do produto: ");
		double valor2 = scan.nextDouble();
		System.out.print("Entre com o último valor do produto: ");
		double valor3 = scan.nextDouble();
		
		if(valor1 <= valor2 && valor1 <= valor3) {
			System.out.println("Leve o primeiro produto informado.");
		} else if(valor2 <= valor1 && valor2 <= valor3) {
			System.out.println("Leve o segundo produto informado.");
		} else {
			System.out.println("Leve o terceiro produto informado.");
		}
	}
}
