package com.rafael.devcursojava.aula13;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		//Operadores Aritmeticos
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado -= 1;
		System.out.println(resultado);
		
		resultado *= 2;
		System.out.println(resultado);
		
		resultado /= 2;
		System.out.println(resultado);
		
		resultado += 8;
		System.out.println(resultado);
		
		resultado %= 7;
		System.out.println(resultado);
		
		String primeiroNome = "Está é ";
		String segundoNome = "uma String concatenada!";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		//Incremento
		System.out.println("--- Incremento ---");
		resultado++;
		System.out.println(resultado);
		++resultado;
		System.out.println(resultado);
		
		//Decremento 
		System.out.println("--- Decremento ---");
		resultado--;
		System.out.println(resultado);
		--resultado;
		System.out.println(resultado);
	}
}
