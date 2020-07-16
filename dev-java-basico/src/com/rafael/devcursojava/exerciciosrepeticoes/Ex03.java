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
				System.out.println("Nome precisa no mínimo de três caracteres.");
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
				System.out.println("A idade informada não é valida, digite novamente.");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			
			System.out.println("Entre com seu salário: ");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				infoValida = true;
			} else {
				infoValida = false;
				System.out.println("Salário informado não pode ser igual ou inferior a zero. Digite novamente: ");
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
				System.out.println("Opção Inválida. Digite novamente: ");
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
				System.out.println("Estado Civil informado é inválido. Digite novamente: ");
			}
		} while (!infoValida);
		
		System.out.println("--- As seguintes informações foram coletadas ---");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}
}
