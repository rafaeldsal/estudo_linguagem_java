/*Criar um vetor A de 10 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho, 
 * sendo que cada elemento de do vetor B deverá ser o resto da divisão
 *  do respectivo elemento de A por 2 (dois), ou seja: B[i] = A[i] % 2.
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("===== EXERCÍCIO 15 ======");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i + ": ");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
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
