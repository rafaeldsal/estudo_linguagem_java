package com.rafael.devcursojava.exerciciosrepeticoes;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int pares = 0, impares = 0;
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println("Entre com um n�mero: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
	}
}
