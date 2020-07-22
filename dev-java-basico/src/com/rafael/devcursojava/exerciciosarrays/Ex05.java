/*Crie um vetor A com 5 elementos inteiros. 
Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" 
elementos do vetor A, ou seja, B[i] = A[i]
*/
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("===== EXERCÍCIO 05 =====");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i + ": ");
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
