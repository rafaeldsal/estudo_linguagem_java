//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] notas = new double[4];
		double media;
		
		System.out.println("===== EXERCÍCIOS 03 ======");
		
		for(int i = 1; i < notas.length; i++) {
			System.out.printf("Informe a %d nota: ", i);
			notas[i] = input.nextDouble();
		}
		
		media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
		
		for(int j = 0; j < notas.length; j++) {
			System.out.println("A " + j + " informada é: " + notas[j]);
		}
		System.out.println("E a média é de: " + media);
	}

}
