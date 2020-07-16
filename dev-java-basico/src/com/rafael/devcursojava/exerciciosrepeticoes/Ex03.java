package com.rafael.devcursojava.exerciciosrepeticoes;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
			
		
		do {
			
			System.out.print("Entre com o nome: ");
			nome = scan.nextLine();
			
			if(nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no m�nimo de tr�s caracteres.");
			}
		} while(!infoValida);
		
		
		infoValida = false;
		do {
			
			System.out.println("Entre com sua idade:");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("A idade informada n�o � valida, digite novamente.");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com seu sal�rio: ");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Sal�rio informado n�o pode ser igual ou inferior a zero. Digite novamente: ");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com seu sexo (F - M): ");
			sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("f") || (sexo.equalsIgnoreCase("m"))) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Op��o Inv�lida. Digite novamente: ");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com seu estado civil (S - Solteiro; C - Casado; V - Viuvo; D - Divorciado): ");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") || (estadoCivil.equalsIgnoreCase("c")) || (estadoCivil.equalsIgnoreCase("v")) 
					|| (estadoCivil.equalsIgnoreCase("v")) || (estadoCivil.equalsIgnoreCase("d"))) {
				
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Estado Civil informado � inv�lido. Digite novamente: ");
			}
		} while (!infoValida);
		
		System.out.println("--- As seguintes informa��es foram coletadas ---");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}
}
