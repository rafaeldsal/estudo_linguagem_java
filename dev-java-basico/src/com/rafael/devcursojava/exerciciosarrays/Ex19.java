/*Criar um vetor A com 10 elementos inteiros. 
 * Implementar um programa que defina e escreva a 
 * média aritmetica simples dos elementos ímpares armazenados neste valor.
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0, impar = 0;
		
		System.out.println("===== EXERCÍCIO 19 =====");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do vetor na posição " + i);
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Soma: " + soma);
		
		System.out.println("Média: " + (soma / impar));
		
	}
}	
