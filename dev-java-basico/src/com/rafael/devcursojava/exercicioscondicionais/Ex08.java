package com.rafael.devcursojava.exercicioscondicionais;

//Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		int num1 = scan.nextInt();
		System.out.print("Entre com mais um valor: ");
		int num2 = scan.nextInt();
		System.out.print("Entre com o �ltimo valor: ");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O " + num1 + " � o maior n�mero informado.");
		} else if(num2 > num3 && num2 > num3) {
			System.out.println("O " + num2 + " � o maior n�mero informado.");
		} else {
			System.out.println("O " + num3 + " � o maior n�mero informado.");
		}
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("O " + num1 + " � o menor n�mero informado.");
		} else if(num2 < num1 && num2 < num3) {
			System.out.println("O " + num2 + " � o menor n�mero informado.");
		} else {
			System.out.println("O " + num3 + " � o menor n�mero informado.");
		}
	}
}
