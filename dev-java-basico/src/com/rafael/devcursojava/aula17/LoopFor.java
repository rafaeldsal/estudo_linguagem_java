package com.rafael.devcursojava.aula17;

public class LoopFor {
	public static void main(String[] args) {
		
		//Comando for normal
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		System.out.println("\n");
		for(int i = 5; i > 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		//Comando for com mais de uma variável
		System.out.println("\n");
		for(int i = 0, j = 10; i < j; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		//Comando for com partes ausentes
		System.out.println("\n");
		int count = 0;
		for( ; count < 10; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
	}
}
