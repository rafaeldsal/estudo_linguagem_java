package com.rafael.devcursojava.exercicios;

//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class Ex15{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- TEMPO APROXIMADO PARA DOWNLOAD DE UM ARQUIVO ---\n");

		System.out.print("Entre com o tamanho do arquivo (MB): ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.print("Entre com a velocidade da Internet (Mbps): ");
		double velocidadeInternet = scan.nextDouble();

		double tempo = tamanhoArquivo / velocidadeInternet;

		System.out.println("O tempo aproximado para o Download do arquivo é de: " + tempo + " minutos");
	}
}