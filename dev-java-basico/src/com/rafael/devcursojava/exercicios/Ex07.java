package com.rafael.devcursojava.exercicios;

//Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.

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

		System.out.print("A area do quadra � " + area + " e seu dobro eh de: " + dobro);


	}
}