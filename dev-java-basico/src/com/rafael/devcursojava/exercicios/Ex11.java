package com.rafael.devcursojava.exercicios;

/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo.
*/
import java.util.Scanner;

public class Ex11{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com um numero inteiro: ");
		int n1 = scan.nextInt();
		System.out.print("Entre com outro numero inteiro: ");
		int n2 = scan.nextInt();
		System.out.print("Entre com um numero real: ");
		double n3 = scan.nextDouble();
		

		int produto = (n1 * 2) * (n2 / 2);
		double soma = (n1 * 3) + n3;
		double cubo = Math.pow(n3, 3);

		System.out.println("\nO produto do primeiro com metade do segundo: " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("O terceiro elevado ao cubo: " + cubo);
		}
}
