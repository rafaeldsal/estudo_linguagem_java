package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double precoGas = 2.5, precoAlc = 1.9, valorPago, desconto, total = 0;
		int percDesconto = 0;
		
		System.out.print("Entre com a quantidade de litros vendidos: ");
		double litro = scan.nextDouble();
		
		System.out.println("\n--- Informe qual tipo de combustível utilizado ---\n(G) - Gasolina\n(A) - Álcool");
		String tipo = scan.next();
		
		if(tipo.equalsIgnoreCase("A")) {
			if(litro <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			
		total = litro * precoAlc;
			
		} else if(tipo.equalsIgnoreCase("G")) {
			if(litro <= 4) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			
		total = litro * precoGas;
			
		} else {
			System.out.println("Opção incorreta!");
		}
		
		desconto = (total / 100) * percDesconto;
		valorPago = total - desconto;
		
		System.out.println("O valor a ser pago é: " + valorPago);
		
	}
}
