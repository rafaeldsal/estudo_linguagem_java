package com.rafael.devcursojava.exercicios;

//Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
//C = (5 * (F-32) / 9).

import java.util.Scanner;

public class Ex09{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("--- FARENHEIT PARA CELSIUS ---\n\n");
		System.out.print("Informe uma temperatura em Graus Farenheit: ");
		double F = scan.nextDouble();

		double C = (5 * (F - 32) / 9);

		System.out.print("A tempuratura informada em Graus Celsius é: " + C);
	}
}