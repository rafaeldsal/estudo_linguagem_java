package com.rafael.devcursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine(); //Ler toda uma linha de informa��es
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite o sue primeiro nome: ");
		String primeiroNome = scan.next(); //Ler somente a primeira palavra(String) informada
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt(); //Ler uma vari�vel do tipo inteira
		System.out.println("Sua idade �: " + idade);
		*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estima��o(S/N): ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguinte valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Animal de Estima��o: " + temPet);
		
		
	}

}
