package com.rafael.devcursojava.exercicios;

//Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea

import java.util.Scanner;

public class Ex06{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- AREA DE UMA CIRCUNFERENCIA ---");
		System.out.println("Informe o raio da circunferencia: ");
		double raio = scan.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("A area desta circunferencia eh igual a: " + area);

	}
}