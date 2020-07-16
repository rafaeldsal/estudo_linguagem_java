package com.rafael.devcursojava.exerciciosrepeticoes;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA, popB, taxaA, taxaB;
		boolean valido = false;
		
		do {
			
			System.out.println("Entre com o valor da popula��o A: ");
			popA = scan.nextDouble();
			
			if(popA > 0) {
				valido = true;
			} else {
				valido = false;
				System.out.println("A popula��o informada n�o pode ser inferior/igual a zero. Informe novamente.");
			}
		} while (!valido);
		
		valido = false;
		do {
			
			System.out.println("Entre com o valor da popula��o B: ");
			popB = scan.nextDouble();
			
			if(popB > 0) {
				valido = true;
			} else {
				valido = false;
				System.out.println("A popula��o informada n�o pode ser inferior/igual a zero. Informe novamente.");
			}			
		} while(!valido);
		
		valido = false;
		do {
			
			System.out.println("Entre com a taxa de crescimento para a popula��o A: ");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			} else {
				valido = false;
				System.out.println("A taxa de crescimento anual n�o pode ser inferior/igual a zero. Informe novamente.");
			}
		} while(!valido);
		
		valido = false;
		do {
			
			System.out.println("Entre com a tava de crescimento para a popula��o B: ");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			} else {
				valido = false;
				System.out.println("A taxa de crescimento anual n�o pode ser inferior/igual a zero. Informe novamente.");
			}
		} while(!valido);
		
		
		valido = false;
		int cont = 0;
		
		while (popA < popB) {
			
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}
		
		System.out.println("Popula��o de A: " + popA);
		System.out.println("Popula��o de B: " + popB);
		System.out.println("Qtd anos: " + cont);
		
	}
}
