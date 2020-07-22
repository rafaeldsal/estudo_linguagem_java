/*Criar um vetor A com 15 elementos interos. 
 * Construir um vetor B de mesmo tipo e tamanho, 
 * sendo que cada elemento do vetor B dever� ser o 
 * quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[i]
*/
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("====== EXERC�CIO 07 ======");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posi��o " + i + ": ");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
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
