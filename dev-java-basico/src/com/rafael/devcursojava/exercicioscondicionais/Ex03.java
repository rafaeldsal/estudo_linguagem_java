package com.rafael.devcursojava.exercicioscondicionais;
//Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		double num = scan.nextDouble();
		
		if(num >= 0) {
			System.out.println("O n�mero " + num + " � positivo");
		} else {
			System.out.println("O n�mero " + num + " � negativo");
		}
		
	}
}
