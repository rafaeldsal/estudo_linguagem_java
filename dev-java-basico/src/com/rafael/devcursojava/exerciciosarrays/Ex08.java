/*Criar um vetor A com 15 elementos interos. 
 * Construir um vetor B de mesmo tipo e tamanho, 
 * sendo que cada elemento do vetor B deverá ser a raiz quadrada
 * do respectivo elemente de A, ou seja: B[i] = sqrt(A[i])
*/
package com.rafael.devcursojava.exerciciosarrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		System.out.println("===== EXERCÍCIO 08 ======");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i + ": ");
			vetorA[i] = input.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}
	}


}
