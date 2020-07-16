package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salario, percentual;
		int aumento1 = 20, aumento2 = 15, aumento3 = 10, aumento4 = 5;
		
		System.out.println("--- REAJUSTE SALÁRIAL ---");
		
		System.out.print("Entre com o valor do seu salário: ");
		salario = scan.nextDouble();
		
		if(salario <= 280) {
			percentual = (salario / 100) * aumento1;
			System.out.println("Salário atual: " + salario + "R$");
			System.out.println("Percentual de aumento: " + aumento1 + "%");
			System.out.println("Valor do aumento: " + percentual + "R$");
			System.out.println("Salário com aumento: " + (percentual + salario) + "R$");
		} else if (salario > 280 && salario <= 700) {
			percentual = (salario / 100) * aumento2;
			System.out.println("Salário atual: " + salario + "R$");
			System.out.println("Percentual de aumento: " + aumento2 + "%");
			System.out.println("Valor do aumento: " + percentual + "R%");
			System.out.println("Salário com aumento: " + (salario + percentual) + "R$");
		} else if(salario > 700 && salario <= 1500) {
			percentual = (salario / 100) * aumento3;
			System.out.println("Salário atual: " + salario + "R$");
			System.out.println("Percentual de aumento: " + aumento3 + "%");
			System.out.println("Valor do aumento: " + percentual + "R$");
			System.out.println("Salário com aumento: " + (salario + percentual) + "R$");
		} else {
			percentual = (salario / 100) * aumento4;
			System.out.println("Salário atual: " + salario + "R$");
			System.out.println("Percentual de aumento: " + aumento4 + "%");
			System.out.println("Valor do aumento: " + percentual + "R$");
			System.out.println("Salário aumento: " + (salario + percentual) + "R$");
		}
	}
}
