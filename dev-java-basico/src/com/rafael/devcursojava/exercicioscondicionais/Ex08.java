package com.rafael.devcursojava.exercicioscondicionais;

//Faça um Programa que leia três números e mostre o maior e o menor deles.

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		int num1 = scan.nextInt();
		System.out.print("Entre com mais um valor: ");
		int num2 = scan.nextInt();
		System.out.print("Entre com o último valor: ");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O " + num1 + " é o maior número informado.");
		} else if(num2 > num3 && num2 > num3) {
			System.out.println("O " + num2 + " é o maior número informado.");
		} else {
			System.out.println("O " + num3 + " é o maior número informado.");
		}
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("O " + num1 + " é o menor número informado.");
		} else if(num2 < num1 && num2 < num3) {
			System.out.println("O " + num2 + " é o menor número informado.");
		} else {
			System.out.println("O " + num3 + " é o menor número informado.");
		}
	}
}
