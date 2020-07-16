package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String conceito = "";

		System.out.print("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;
/*
		if (media >= 9 && media <= 10) {
			conceito = "A";
			System.out.println("Notas informadas: " + nota1 + " e " + nota2);
			System.out.println("Média final: " + media);
			System.out.println("Conceito: " + conceito);
			System.out.println("\'Aprovado\'");
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
			System.out.println("Notas informadas: " + nota1 + " e " + nota2);
			System.out.println("Média final: " + media);
			System.out.println("Conceito: " + conceito);
			System.out.println("\'Aprovado\'");
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
			System.out.println("Notas informadas: " + nota1 + " e " + nota2);
			System.out.println("Média final: " + media);
			System.out.println("Conceito: " + conceito);
			System.out.println("\'Aprovado\'");
		} else if (media >= 4 && media < 6) {
			conceito = "D";
			System.out.println("Notas informadas: " + nota1 + " e " + nota2);
			System.out.println("Média final: " + media);
			System.out.println("Conceito: " + conceito);
			System.out.println("\'Reprovado\'");
		} else {
			conceito = "E";
			System.out.println("Notas informadas: " + nota1 + " e " + nota2);
			System.out.println("Média final: " + media);
			System.out.println("Conceito: " + conceito);
			System.out.println("\'Reprovado\'");
		}
		*/
		
		if(media >= 9 && media <= 10) {
			conceito = "A";
		} else if(media >= 7.5 && media < 9) {
			conceito = "B";
		} else if(media >= 6 && media < 7.5) {
			conceito = "C";
		} else if(media >= 4 && media < 6) {
			conceito = "D";
		} else {
			conceito = "E";
		}
		
		System.out.println("Notas: " + nota1 + " e " + nota2);
		System.out.println("Méddia Final: " + media);
		System.out.println("Conceito: " + conceito);
		
		if(conceito.equalsIgnoreCase("A")) {
			if(conceito.equalsIgnoreCase("B")) {
				if(conceito.equalsIgnoreCase("C")) {
					System.out.println("Aprovado");
				}
			}
		} else {
			System.out.println("Reprovado");
		}
	}
}
