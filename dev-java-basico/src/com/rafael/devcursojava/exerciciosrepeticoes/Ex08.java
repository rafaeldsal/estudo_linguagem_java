package com.rafael.devcursojava.exerciciosrepeticoes;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, soma = 0;
		double media;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			
			soma += num;
			
		}
		System.out.println("Soma: " + soma);
		
		media = soma / 5;
		
		System.out.println("Media: " + media);
	}
}
