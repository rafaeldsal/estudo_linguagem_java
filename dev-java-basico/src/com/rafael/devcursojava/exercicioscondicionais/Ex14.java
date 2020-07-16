package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com um número correspondente aos dias da semana (1 - 7): ");
		int diaSemana = scan.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("1 - Domingo.");
			break;
		case 2:
			System.out.println("2 - Segunda-Feira.");
			break;
		case 3:
			System.out.println("3 - Terça-Feira.");
			break;
		case 4:
			System.out.println("4 - Quarta-Feira.");
			break;
		case 5:
			System.out.println("5 - Quinta-Feira.");
			break;
		case 6:
			System.out.println("6 - Sexta-Feira.");
			break;
		case 7:
			System.out.println("7 - Sábado.");
			break;
		default:
			System.out.println("Valor informado é inválido.");
		}
	}
}
