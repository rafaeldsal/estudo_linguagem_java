// Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== EXERCÍCIO 01 =====");
		
		int nums[] = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Digite um valor para a posição " + i + " do vetor.");
			nums[i] = input.nextInt();
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.println("O número informados no vetor " + j + " é: " + nums[j]);
		}
		

	}

}
