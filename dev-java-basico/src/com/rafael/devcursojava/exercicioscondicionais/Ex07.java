package com.rafael.devcursojava.exercicioscondicionais;
//Faça um Programa que leia três números e mostre o maior deles.
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		int num1 = scan.nextInt();
		System.out.print("Entre com outro valor: ");
		int num2 = scan.nextInt();
		System.out.print("Entre com um último valor: ");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O " + num1 + " é o maior número informado!");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("O " + num2 + " é o maior número informado!");
		} else {
			System.out.println("O " + num3 + " é o maior número informado!");
		}
		
	}
}
