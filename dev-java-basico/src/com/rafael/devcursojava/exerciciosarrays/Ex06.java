/*Crie um vetor A com 8 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho e 
 * com os elementos do vetor A multiplicados por 2, 
 * ou seja: B[i] = A[i] * 2
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("===== EXERC�CIO 06 ======");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posi��o " + i + ": ");
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * 2;
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
		
	}

}
