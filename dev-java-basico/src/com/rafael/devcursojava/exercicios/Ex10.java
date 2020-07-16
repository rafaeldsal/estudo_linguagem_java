package com.rafael.devcursojava.exercicios;

//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

import java.util.Scanner;

public class Ex10{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- CELSIUS PARA FARENHEIT ---\n\n");
		System.out.print("Informe a temperatura em Graus Celsius: ");
		double C = scan.nextDouble();

		double F = (C * 9 / 5) + 32;

		System.out.print("A temperatura em Farenheit eh de: " + F);
	}
}