/*Criar um vetor A de 10 elementos inteiros. 
 * Implementar um programa que defina e escreva a 
 * quantidade de elementos armazenados neste vetor que são pares.
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] agrs) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== EXERCÍCIO 16 ======");
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int qtdPares = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um valor para a posição " + i + " do vetor: ");
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Qtd números pares: " + qtdPares);
		
		
		
	}
}
