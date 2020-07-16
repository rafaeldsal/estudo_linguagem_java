package com.rafael.devcursojava.exercicioscondicionais;
//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- SISTEMA PARA DIFERENCIAR VOGAIS DE COSOANTES ---");
		
		System.out.print("Entre com uma letra: ");
		String vogal = scan.next();
		
		if(vogal.length() > 1) {
			System.out.println("Não é uma letra válida!");
		} else {
			switch (vogal){
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("A letra informada é uma vogal.");
				break;
			default:
				System.out.println("A letra informada é uma consoante.");
			}
		}
		
		/*if(vogal.equalsIgnoreCase("a") || vogal.equalsIgnoreCase("e") || vogal.equalsIgnoreCase("i") || vogal.equalsIgnoreCase("o") || vogal.equalsIgnoreCase("u")) {
			System.out.println("A letra informada é uma vogal.");
		} else {
			System.out.println("A letra informada é uma consoante.");
		}*/
	}
}

