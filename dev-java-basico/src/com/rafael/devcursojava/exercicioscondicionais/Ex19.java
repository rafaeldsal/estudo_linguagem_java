package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O número " + num + " é par.");
		} else {
			System.out.println("O número " + num + " é ímpar.");
		}
	}
}
