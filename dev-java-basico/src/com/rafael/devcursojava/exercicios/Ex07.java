package com.rafael.devcursojava.exercicios;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Ex07{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		double pi = 3.14;
		double area, dobro;

		System.out.println("--- DOBRO DA AREA DE UM QUADRADO ---\n");

		System.out.print("Informe o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();

		area = Math.pow(lado, 2);
		dobro = area * 2;

		System.out.print("A area do quadra é " + area + " e seu dobro eh de: " + dobro);


	}
}