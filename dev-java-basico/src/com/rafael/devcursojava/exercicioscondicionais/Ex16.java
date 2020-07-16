package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Entre com o primeiro lado do tri�ngulo: ");
		double lado1 = scan.nextDouble();
		System.out.print("Entre com o segundo lado do tri�ngulo: ");
		double lado2 = scan.nextDouble();
		System.out.print("Entre com o �ltimo lado do tri�ngulo: ");
		double lado3 = scan.nextDouble();
		
		if(lado1 + lado2 > lado3 || lado1 + lado3 > lado2) {
			if(lado2 + lado1 > lado3 || lado2 + lado3 > lado1) {
				System.out.println("Os n�mero informados formam um tri�ngulo.");
			}
		} else {
			System.out.println("Os n�mero informado n�o formam um tri�ngulo.");
		}
		
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("Os n�meros informados formam um Tri�ngulo Equil�tero.");
		} else if((lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1) || (lado3 == lado1 && lado3 != lado2)) {
			System.out.println("Os n�meros inforados formam um Tri�ngulo Is�sceles.");
		} else if(lado1 != lado2 && lado1 != lado3) {
			System.out.println("Os n�meros informados formam um Tri�ngulo Escaleno.");
		}
		
	}
}
