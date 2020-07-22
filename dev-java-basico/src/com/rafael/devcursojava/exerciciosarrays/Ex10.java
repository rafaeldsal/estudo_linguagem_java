/*Criar um vetor A com 10 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho, 
 * sendo que cada elemento do vetor B dever� ser o rescpectivo elemento de
 *  A multiplicado por sua posi��o (ou indice), ou seja: B[i] = A[i] * i 
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("===== EXERC�CIO 10 ======");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posi��o " + i + ": ");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] * i;
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
