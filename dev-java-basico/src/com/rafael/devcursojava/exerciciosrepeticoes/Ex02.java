package com.rafael.devcursojava.exerciciosrepeticoes;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean validador = false;
		
		do {
			System.out.println("Usuário: ");
			String nomeUser = scan.nextLine();
			System.out.println("Senha: ");
			String senha = scan.nextLine();
			
			if(nomeUser.equalsIgnoreCase(senha)) {
				validador = false;
				System.out.println("Acesso negado, tente novamente");
			} else if(nomeUser == senha) {
				validador = true;
				System.out.println("Acesso liberado!");
			}
		} while (!validador);
	}
}
