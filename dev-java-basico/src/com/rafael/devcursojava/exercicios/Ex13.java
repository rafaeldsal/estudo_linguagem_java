package com.rafael.devcursojava.exercicios;

/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
*/

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- PESO IDEAL ---\n");

		System.out.print("Informe sua altura: ");
		double h = scan.nextDouble();

		double pesoHomens = (72.2 * h) - 58;
		double pesoMulheres = (62.1 * h) - 44.7;

		System.out.println("Peso ideal para mulheres de acordo com altura informada: " + pesoMulheres);
		System.out.print("Peso ideial para homens de acordo com altura informada: " + pesoHomens);

	}
}
