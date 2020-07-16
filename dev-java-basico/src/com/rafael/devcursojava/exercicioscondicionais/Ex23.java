package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double precoKgMorango = 0, precoKgMaca = 0, valorMorango, valorMaca, valorTotal = 0, valorParcial = 0;
		
		System.out.println("Entre com a quantidade (kg) de morango: ");
		double qtdMorango = scan.nextDouble();
		System.out.print("Entre com a quatidade (kg) de maça: ");
		double qtdMaca = scan.nextDouble();
		
		
		if(qtdMorango <= 5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2;
		} 
		
		if(qtdMaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5;
		}
		
		valorMorango = qtdMorango * precoKgMorango;
		valorMaca = qtdMaca * precoKgMaca;
		
		valorParcial = valorMorango + valorMaca;
		valorTotal = valorParcial;
		
		if((qtdMorango + qtdMaca) > 8 || (valorParcial > 25)) {
			valorTotal = valorParcial - (valorParcial / 100) * 10;
		}
		
		System.out.println("Preço total: " + valorTotal);
				
	}
}
