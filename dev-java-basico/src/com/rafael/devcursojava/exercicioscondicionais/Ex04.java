/*package com.rafael.devcursojava.exercicioscondicionais;
//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a letra correspondente ao seu sexo (F ou M): ");
		String sexo = scan.next();
		
		switch(sexo) {
			case "F": 
				System.out.println("F - Feminino");
				break;
			case "f":
				System.out.println("F - Feminino");
				break;
			case "M":
				System.out.println("M - Masculino");
				break;
			case "m":
				System.out.println("M - Masculino");
				break;
			default:
				System.out.println("Sexo Inválido");
		}
	}
}*/

//COMPARANDO STRING UTILIZANDO IF/ELSE

package com.rafael.devcursojava.exercicioscondicionais;
//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a letra correspondente ao seu sexo (F ou M): ");
		String sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if(sexo.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo Inválido");
		}
	}
}
