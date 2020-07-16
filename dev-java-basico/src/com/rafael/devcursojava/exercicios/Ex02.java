package com.rafael.devcursojava.exercicios;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
import java.util.Scanner;

public class Ex02{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero inteiro qualquer: ");
		int numero = scan.nextInt();
		System.out.println("O numero informado foi: " + numero);
	}
}