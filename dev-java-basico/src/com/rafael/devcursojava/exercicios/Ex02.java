package com.rafael.devcursojava.exercicios;

//Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero].
import java.util.Scanner;

public class Ex02{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero inteiro qualquer: ");
		int numero = scan.nextInt();
		System.out.println("O numero informado foi: " + numero);
	}
}