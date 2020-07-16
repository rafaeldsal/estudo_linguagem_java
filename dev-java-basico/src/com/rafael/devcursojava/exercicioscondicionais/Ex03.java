package com.rafael.devcursojava.exercicioscondicionais;
//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		double num = scan.nextDouble();
		
		if(num >= 0) {
			System.out.println("O número " + num + " é positivo");
		} else {
			System.out.println("O número " + num + " é negativo");
		}
		
	}
}
