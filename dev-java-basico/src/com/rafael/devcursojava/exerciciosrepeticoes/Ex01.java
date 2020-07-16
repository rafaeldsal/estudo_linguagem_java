package com.rafael.devcursojava.exerciciosrepeticoes;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com uma nota de 0 - 10: ");
			int nota = scan.nextInt();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Voce digitou: " + nota);
			} else {
				System.out.println("Nota inválida, digite novamente.");
			}
		} while (!notaValida);
		
		
	}
}
