package com.rafael.devcursojava.exerciciosrepeticoes;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i = 2; i < num; i++) {
			
			if(i % 2 == 0) {
				System.out.println("O n�mero informado n�o � primo.");
				primo = false;
			}
		}
		
		if(primo) {
			System.out.println("O n�mero informado � primo.");
		}
	}
}
