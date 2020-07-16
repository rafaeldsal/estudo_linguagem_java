package com.rafael.devcursojava.aula13;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		int valor1 = 1, valor2 = 2;
		
		System.out.println("Valor1 = " + valor1 + "\nValor2 = " + valor2);
		
		boolean resultado1 = (valor1 == 1) && (valor1 == 2);
		System.out.println("Valor1 AND Valor2 - Resultado: " + resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor1 == 2);
		System.out.println("Valor1 OUR Valor2 - Resultado: " + resultado2);
		
		boolean verdadeiro = true, falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
		
	}
}
