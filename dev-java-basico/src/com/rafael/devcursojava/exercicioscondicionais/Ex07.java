package com.rafael.devcursojava.exercicioscondicionais;
//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		int num1 = scan.nextInt();
		System.out.print("Entre com outro valor: ");
		int num2 = scan.nextInt();
		System.out.print("Entre com um �ltimo valor: ");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O " + num1 + " � o maior n�mero informado!");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("O " + num2 + " � o maior n�mero informado!");
		} else {
			System.out.println("O " + num3 + " � o maior n�mero informado!");
		}
		
	}
}
