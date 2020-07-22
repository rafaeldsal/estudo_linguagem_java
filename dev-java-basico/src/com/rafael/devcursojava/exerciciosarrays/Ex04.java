//Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
package com.rafael.devcursojava.exerciciosarrays;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] letras = new String[10];
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println("Informe uma letra para ocupar o " + i + " do vetor: ");
			letras[i] = input.next();
		}
		
		for(int j = 0; j < letras.length; j++) {
			System.out.println("A letras informadas foram: " + letras[j]);
			}
		
		for(int i = 0; i < letras.length; i++) {
			switch (letras[i]){
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "u":
			case "U":
				System.out.println("As letras informadas são vogais: " + letras[i]);
				break;
			default:
				System.out.println("As letras informadas são consoantes: " + letras[i]);
			}	
		}
	}

}
