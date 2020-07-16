package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cont = 0;
		
		System.out.print("Telefonou para a vitima?(S - N): ");
		String resp1 = scan.next();
		System.out.print("Esteve no local do crime?(S - N): ");
		String resp2 = scan.next();
		System.out.print("Mora perto da vítima?(S - N): ");
		String resp3 = scan.next();
		System.out.print("Devia para a vítima?(S - N): ");
		String resp4 = scan.next();
		System.out.print("Já trabalhou com a vítima?(S - N): ");
		String resp5 = scan.next();
		
		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeito!");
		} else if((cont == 3) || (cont == 4)) {
			System.out.println("Cúmplice!");
		} else if (cont == 5) {
			System.out.println("Assassino!");
		} else if(cont == 0) {
			System.out.println("Inocente!");
		}
		
	}
}
