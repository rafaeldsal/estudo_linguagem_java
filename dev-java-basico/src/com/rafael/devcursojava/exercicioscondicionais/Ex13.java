package com.rafael.devcursojava.exercicioscondicionais;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sindicato = 3, fgts = 11, inss = 10, ir1 = 5, ir2 = 10, ir3 = 20;
		double descontoInss, descontoFgts, descontoTotal, salarioBruto, salarioLiquido, ir;
		
		
		System.out.println("--- SISTEMA PARA CALCULO DA FOLHA DE PAGAMENTO ---");
		
		System.out.print("Entre com o valor da hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
		int horasTrabalhadas = scan.nextInt();
		
		salarioBruto = valorHora * horasTrabalhadas;
		
		if(salarioBruto <= 900) {
			System.out.println("\nSalário Bruto (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto + "R$");
			System.out.println("(-) IR: Isento");
			descontoInss = (salarioBruto / 100) * inss;
			System.out.println("(-) INSS (" + inss + "%): " + descontoInss + "R$");
			descontoFgts = (salarioBruto / 100) * fgts;
			System.out.println("FGTS (" + fgts + "%): " + descontoFgts + "R$");
			descontoTotal = descontoInss;
			System.out.println("Total de descontos: " + descontoTotal + "R$");
			salarioLiquido = salarioBruto - descontoTotal;
			System.out.println("Salário Liquido: " + salarioLiquido);
		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			System.out.println("\nSalário Bruto (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto + "R$");
			ir = (salarioBruto / 100) * ir1;
			System.out.println("(-) IR (" + ir1 + "): " + ir + "R$");
			descontoInss = (salarioBruto / 100) * inss;
			System.out.println("(-) INSS (" + inss + "%): " + descontoInss + "R$");
			descontoFgts = (salarioBruto / 100) * fgts;
			System.out.println("FGTS (" + fgts + "%): " + descontoFgts + "R$");
			descontoTotal = ir + descontoInss;
			System.out.println("Total de descontos: " + descontoTotal + "R$");
			salarioLiquido = salarioBruto - descontoTotal;
			System.out.println("Salário Liquido: " + salarioLiquido + "R$");
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			System.out.println("\nSalário Bruto (" + valorHora + " * " + horasTrabalhadas + "); " + salarioBruto + "R$");
			ir = (salarioBruto / 100) * ir2;
			System.out.println("(-) IR (" + ir2 + "%): " + ir + "R$");
			descontoInss = (salarioBruto / 100) * inss;
			System.out.println("(-) INSS (" + inss + "%): " + descontoInss + "R$");
			descontoFgts = (salarioBruto / 100) * fgts;
			System.out.println("FGTS (" + fgts + "%): " + descontoFgts + "R$");
			descontoTotal = ir + descontoInss;
			System.out.println("Total de descontos: " + descontoTotal + "R$");
			salarioLiquido = salarioBruto - descontoTotal;
			System.out.println("Salário Liquido: " + salarioLiquido + "R$");
		} else {
			System.out.println("\nSalário Bruto (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto + "R$");
			ir = (salarioBruto / 100) * ir3;
			System.out.println("(-) IR (" + ir3 + "%): " + ir + "R$");
			descontoInss = (salarioBruto / 100) * inss;
			System.out.println("(-) INSS (" + inss + "%): " + descontoInss + "R$");
			descontoFgts = (salarioBruto / 100) * fgts;
			System.out.println("FGTS (" + fgts + "%): " + descontoFgts + "R$");
			descontoTotal = ir + descontoInss;
			System.out.println("Total de descontos: " + descontoTotal + "R$");
			salarioLiquido = salarioBruto - descontoTotal;
			System.out.println("Salário Liquido: " + salarioLiquido + "R$");
		}	
	}
}
