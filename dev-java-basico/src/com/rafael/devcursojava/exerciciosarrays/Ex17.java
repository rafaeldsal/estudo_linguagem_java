/*Criar um vetor A de 10 elementos inteiros. 
 * Implementar um programa que defina e escreva a 
 * soma de todos os elementos armazenados nesse vetor
 */
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[2];
		int soma = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor para a posição " + i + " do vetor: ");
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Soma dos elementos do vetor: " + soma);
	}
}
