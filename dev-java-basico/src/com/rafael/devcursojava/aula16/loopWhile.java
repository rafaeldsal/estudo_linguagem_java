package com.rafael.devcursojava.aula16;

public class loopWhile {
	public static void main(String[] args) {
		
		int i = 1;
		int max = 10;
		
		System.out.println("--- CONTANDO ATÉ " + max + " ---");
		
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1; ou i += 1;
		}
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println("O valor de i: " + i);
		} while(i < 15);
		
		System.out.println(i);
	}
}
