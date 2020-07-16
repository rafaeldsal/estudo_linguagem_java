package com.rafael.devcursojava.exercicios;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class Ex12{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- PESO IDEIAL ---\n");
		System.out.print("Informe sua altura: ");
		double altura = scan.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;

		System.out.print("De acordo com sua altura, o seu peso ideial eh de: " + pesoIdeal);
	}
}