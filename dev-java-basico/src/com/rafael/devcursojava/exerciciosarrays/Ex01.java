// Fa�a um Programa que leia um vetor de 5 n�meros inteiros e mostre-os.
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== EXERC�CIO 01 =====");
		
		int nums[] = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Digite um valor para a posi��o " + i + " do vetor.");
			nums[i] = input.nextInt();
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.println("O n�mero informados no vetor " + j + " �: " + nums[j]);
		}
		

	}

}
