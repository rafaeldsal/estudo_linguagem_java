package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b = 0, c = 0, raiz;
		double  raiz1, raiz2;
		
		System.out.println("--- RESOLUÇÃO DE EQUAÇÃO DO SEGUNDO GRAU ---");
		
		System.out.print("Entre com o valor de a: ");
		a = scan.nextInt();
		
		if(a == 0) {
			System.out.println("Tendo informado \'a\' como 0, a equação deixa de ser de segundo grau. \nPrograma Finalizado.");
		} else {
			System.out.print("Entre com o valor de b: ");
			b = scan.nextInt();
			System.out.print("Entre com o valor de c: ");
			c = scan.nextInt();
		}
		
		double delta = (Math.pow(b, 2) - (4 * a * c));
		System.out.println("O valor de delta é: " + delta);
		
		if(delta < 0) {
			System.out.println("Delta informado é \'" + delta + "\', e para valor de delta negativo, não possui raizes reais.");
		} else if(delta == 0) {
			raiz = -b / (2 * a);
			System.out.println("Delta igual a 0, a raiz será: " + raiz);
		} else {
			raiz1 = (-b + Math.sqrt(delta)) / (2 * a); 
			raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("As raizes dessa equação são: " + raiz1 + " é " + raiz2 + ".");
		}
		

	}
}
