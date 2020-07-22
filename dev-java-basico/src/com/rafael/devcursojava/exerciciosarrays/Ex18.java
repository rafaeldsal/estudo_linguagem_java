/*Criar um vetor A de 10 elementos inteiros. 
 * Implementar um programa que determine a soma dos
 * elementos armazenados neste vetor que são multiplos de 5.
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		System.out.println("===== EXERCÍCIO 18 =====");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valor do vetor na posição " + i);
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Soma: " + soma);
		
		}
		
	}

