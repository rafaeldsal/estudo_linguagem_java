// Fa�a um Programa que leia um vetor de 10 n�meros reais e mostre-os na ordem inversa.
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== EXERC�CIOS 02 =====");
		
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um n�mero: ");
			vetor[i] = input.nextInt();
		}
		
		for(int j = (vetor.length - 1); j >= 0; j--) {
			System.out.print(vetor[j] + ", ");
		}
		
	}

}
