package com.rafael.devcursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		//Declarando arrays
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		temperaturas[5] = 32.8;
		temperaturas[6] = 30;
		temperaturas[7] = 29.8;
		
		//Imprimindo arrays
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		//Tamanho do array
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		//Imprimindo valores do array
		System.out.println("Valores do array: ");
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
		}
		
		//for melhorado
		for(double temp : temperaturas) {
			System.out.println(temp);
		}

		
	}

}
