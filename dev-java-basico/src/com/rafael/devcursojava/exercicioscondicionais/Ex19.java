package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero inteiro: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O n�mero " + num + " � par.");
		} else {
			System.out.println("O n�mero " + num + " � �mpar.");
		}
	}
}
