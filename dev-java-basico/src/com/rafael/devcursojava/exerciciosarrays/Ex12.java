/*Criar dois vetores A e B, cada um com 10 elementos inteiros. 
 * Construir um vetor C, onde cada elemento de C � a soma dos 
 * respectivos elementos em A e B, ou seja: C[i] = A[i] - B[i]
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== EXERC�CIO 12 =====");
		int[] vetorA = new int[2];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor para o vetor A na posi��o " + i + ": ");
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor para o vetor B na posi��o " + i + ": ");
			vetorB[i] = input.nextInt();
			
			vetorC[i] = vetorA[i] - vetorB[i];
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
