package com.rafael.devcursojava.exercicioscondicionais;

//Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de S�o Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um programa que leia a vari�vel peso (peso de peixes) e calcule o excesso. Gravar na vari�vel excesso a quantidade de quilos al�m do limite e na vari�vel multa o valor da multa que Jo�o dever� pagar. Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o peso de peixe pegos: ");
		double pesoPeixe = scan.nextDouble();
		
		if (pesoPeixe > 50) {
			pesoPeixe -= 50;
			double excesso = pesoPeixe;
			double multa = excesso * 4;
			System.out.println("Peso de peixe excedido foi de " + excesso + ". Ser� pago a mais " + multa + "R$ pelo excesso.");
		} else {
			System.out.println("Tudo certo. Foi pego a quantidade de peso ideal.");
		}
	}
}
