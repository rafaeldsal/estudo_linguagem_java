package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- ANO BISSEXTO ---");
		
		System.out.print("Entre com um ano para averiguar se o mesmo é bissexto: ");
		int ano = scan.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano + " é um Ano Bissexto.");
		} else {
			System.out.println("O ano " + ano + " não é um Ano Bissexto.");
		}
	}
}
