package com.rafael.devcursojava.exercicioscondicionais;

//Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o turno em que voc� estuda (M - V - N): ");
		String turno = scan.next();
		
		/*switch(turno) {
			case "M":
			case "m":
				System.out.println("\"Bom dia!\"");
				break;
			case "V":
			case "v":
				System.out.println("\"Boa tarde!\"");
				break;
			case "N":
			case "n":
				System.out.println("\"Boa noite!\"");
				break;
			default:
				System.out.println("\"Valor Inv�lido!\"");
		}*/
		
		if(turno.equalsIgnoreCase("m")) {
			System.out.println("\"Bom dia!\"");
		} else if(turno.equalsIgnoreCase("v")) {
			System.out.println("\"Boa tarde!\"");
		} else if(turno.equalsIgnoreCase("n")) {
			System.out.println("\"Boa noite!\"");
		} else {
			System.out.println("\"Valor Inv�lido!\"");
		}
	}
}
