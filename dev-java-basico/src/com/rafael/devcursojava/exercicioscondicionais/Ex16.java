package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Entre com o primeiro lado do triângulo: ");
		double lado1 = scan.nextDouble();
		System.out.print("Entre com o segundo lado do triângulo: ");
		double lado2 = scan.nextDouble();
		System.out.print("Entre com o último lado do triângulo: ");
		double lado3 = scan.nextDouble();
		
		if(lado1 + lado2 > lado3 || lado1 + lado3 > lado2) {
			if(lado2 + lado1 > lado3 || lado2 + lado3 > lado1) {
				System.out.println("Os número informados formam um triângulo.");
			}
		} else {
			System.out.println("Os número informado não formam um triângulo.");
		}
		
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("Os números informados formam um Triângulo Equilátero.");
		} else if((lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1) || (lado3 == lado1 && lado3 != lado2)) {
			System.out.println("Os números inforados formam um Triângulo Isósceles.");
		} else if(lado1 != lado2 && lado1 != lado3) {
			System.out.println("Os números informados formam um Triângulo Escaleno.");
		}
		
	}
}
