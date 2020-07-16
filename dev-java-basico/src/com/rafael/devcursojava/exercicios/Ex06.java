package com.rafael.devcursojava.exercicios;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área

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