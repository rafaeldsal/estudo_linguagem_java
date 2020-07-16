package com.rafael.devcursojava.exercicios;

//Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Ex03{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- Soma entre dois numeros ---");
		System.out.print("Informe a primeira parcela para a soma: ");
		int n1 = scan.nextInt();
		System.out.print("Informe a segunda parcela para a soma: ");
		int n2 = scan.nextInt();

		int soma = (n1 + n2);

		System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a: " + soma);
	}
}