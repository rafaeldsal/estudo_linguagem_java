package com.rafael.devcursojava.exerciciosrepeticoes;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número: ");
		int num = scan.nextInt();
		
		int permutacao;
		
		System.out.print(num + "! = ");
		
		permutacao = 1;
		
		for(int i = num; i > 0; i--) {
			
			permutacao *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado: " + permutacao);
	}
}
