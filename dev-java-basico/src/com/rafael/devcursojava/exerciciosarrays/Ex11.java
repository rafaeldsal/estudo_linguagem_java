/*Criar dois vetores A e B, cada um com 10 elementos inteiros. 
 * Construir um vetor C, onde cada elemento de C � a soma dos 
 * respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i]
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== EXERC�CIO 11 =====");
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posi��o " + i + " do vetor A: ");
			vetorA[i] = input.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Informe o valor da posi��o " + i + " do vetor B: ");
			vetorB[i] = input.nextInt();
			
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C: ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
	}
}
