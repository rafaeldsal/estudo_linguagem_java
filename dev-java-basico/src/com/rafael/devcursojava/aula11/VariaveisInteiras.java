package com.rafael.devcursojava.aula11;

public class VariaveisInteiras {
	public static void main(String[] args) {
		
		//Inteiros
		byte idade01 = 18;
		short idade02 = 19;
		int idade03 = 20;
		long idade04 = 21;
		
		System.out.println("Valor da variavel byte: " + idade01);
		System.out.println("Valor da variavel short: " + idade02);
		System.out.println("Valor da variavel int: " + idade03);
		System.out.println("Valor da variavel long: " + idade04);
		System.out.println("\n");
		
		//Ponto Flutuante
		double valorPassagem = 3.5;
		float valorTomate = 3.95f;
		
		System.out.println("Valor da variavel passagem: " + valorPassagem);
		System.out.println("Valor do tomate: " + valorTomate);
		System.out.println("\n");
		
		//Caractere
		
		//char o = 'o';
		//char i = 'i';
		char o = 111;
		char i = 105;
		char interrogacao = 63;
		
		System.out.println("" + o + i + interrogacao);
		System.out.println("\n");
		
		//Boolean
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("O valor de verdadeiro é " + verdadeiro);
		System.out.println("O valor de falso é " + falso);
		System.out.println("\n");
		
		//Curiosidade
		int var1 = 2147483647;
		int var2 = 100;
		
		System.out.println(var1 + var2); //Apesar da variavel var1 tem excedido seu valor máximo, o programa não vai ter erro, e simplesmente pq os número em java funcionam como uma roleta
		//Essa situação ocorre com qualquer tipo de variável
		
		
		
		
	}
}
