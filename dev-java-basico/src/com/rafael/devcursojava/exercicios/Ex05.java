package com.rafael.devcursojava.exercicios;

//Faça um Programa que converta metros para centímetros.
import java.util.Scanner;

public class Ex05{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("--- CONVERTA METROS PARA CENTIMETROS ---");

		System.out.print("Informe um valor em metro: ");
		double metro = scan.nextFloat();

		double centimetro = metro * 100;

		System.out.println("O valor de " + metro + "metro(s) eh em centimetros: " + centimetro + "cm");
	}
}