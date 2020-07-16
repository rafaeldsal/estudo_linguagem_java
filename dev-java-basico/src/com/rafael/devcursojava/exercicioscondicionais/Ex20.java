package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {

	
	Scanner scan = new Scanner(System.in);
	int resultado = 0;
	
	System.out.print("Entre com o primeiro n�mero: ");
	int num1 = scan.nextInt();
	System.out.print("Entre com o segundo n�mero: ");
	int num2 = scan.nextInt();
	
	System.out.println("\nEscola a opera��o desejada: \n(A - Soma):\n(B - Subtra��o):\n(C - Multiplica��o):\n(D - Divis�o):");
	String operacao = scan.next();
	
	switch(operacao) {
		case "a":
		case "A":
			System.out.println("--- Opera��o de Soma ---");
			resultado = num1 + num2;
			System.out.println("A soma entre " + num1 + " + " + num2 + " �: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O resultado da opera��o � par.");
			} else {
				System.out.println("O resultado da opera��o � �mpar.");
			}
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			break;
		case "b":
		case "B":
			System.out.println("--- Opera��o de Subtra��o ---");
			resultado = num1 - num2;
			System.out.println("A subtra��o entre " + num1 + " - " + num2 + " �: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O resultado da opera��o � par.");
			} else {
				System.out.println("O resultado da opera��o � �mpar.");
			}
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			break;
		case "c":
		case "C":
			System.out.println("--- Opera��o de Multiplica��o ---");
			resultado = num1 * num2;
			System.out.println("A multiplica��o entre " + num1 + " * " + num2 + " �: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O resultado da opera��o � par.");
			} else {
				System.out.println("O resultado da opera��o � �mpar.");
			}
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			break;
		case "d":
		case "D":
			System.out.println("--- Operaca��o de Divis�o ---");
			resultado = num1 / num2;
			System.out.println("A divis�o entre " + num1 + " / " + num2 + " �: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O resultado da opera��o � par.");
			} else {
				System.out.println("O resultado da opera��o � �mpar.");
			}
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			break;
		default:
			System.out.println("Op��o informada � inv�lida!");
	}
	}
}
