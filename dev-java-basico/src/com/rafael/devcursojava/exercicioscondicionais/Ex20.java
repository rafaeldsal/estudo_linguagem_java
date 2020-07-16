package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {

	
	Scanner scan = new Scanner(System.in);
	int resultado = 0;
	
	System.out.print("Entre com o primeiro número: ");
	int num1 = scan.nextInt();
	System.out.print("Entre com o segundo número: ");
	int num2 = scan.nextInt();
	
	System.out.println("\nEscola a operação desejada: \n(A - Soma):\n(B - Subtração):\n(C - Multiplicação):\n(D - Divisão):");
	String operacao = scan.next();
	
	switch(operacao) {
		case "a":
		case "A":
			System.out.println("--- Operação de Soma ---");
			resultado = num1 + num2;
			System.out.println("A soma entre " + num1 + " + " + num2 + " é: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O resultado da operação é par.");
			} else {
				System.out.println("O resultado da operação é ímpar.");
			}
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			break;
		case "b":
		case "B":
			System.out.println("--- Operação de Subtração ---");
			resultado = num1 - num2;
			System.out.println("A subtração entre " + num1 + " - " + num2 + " é: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O resultado da operação é par.");
			} else {
				System.out.println("O resultado da operação é ímpar.");
			}
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			break;
		case "c":
		case "C":
			System.out.println("--- Operação de Multiplicação ---");
			resultado = num1 * num2;
			System.out.println("A multiplicação entre " + num1 + " * " + num2 + " é: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O resultado da operação é par.");
			} else {
				System.out.println("O resultado da operação é ímpar.");
			}
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			break;
		case "d":
		case "D":
			System.out.println("--- Operacação de Divisão ---");
			resultado = num1 / num2;
			System.out.println("A divisão entre " + num1 + " / " + num2 + " é: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("O resultado da operação é par.");
			} else {
				System.out.println("O resultado da operação é ímpar.");
			}
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			break;
		default:
			System.out.println("Opção informada é inválida!");
	}
	}
}
