package com.rafael.devcursojava.aula14;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("� maior de idade!");
		} else {
			System.out.println("N�o � maior de idade!");
		}
		*/
		
		//barato <= 10
		//10 < valor < 15 - desconto
		//15 <= valor 17 - Pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Entre com o valor do item: ");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Est� barato, pode comprar!");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Chore por um desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquise um pouco mais");
		} else {
			System.out.println("Muito caro");
		}
	}
}
