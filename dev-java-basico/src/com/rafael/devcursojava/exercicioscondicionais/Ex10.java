package com.rafael.devcursojava.exercicioscondicionais;


import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Entre com o número: ");
		int n1 = scan.nextInt();
		System.out.print("Entre com outro número: ");
		int n2 = scan.nextInt();
		System.out.print("Entre com o último número: ");
		int n3 = scan.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			if(n2 > n3) {
				System.out.println(""+ n1 + "" + n2 + "" + n3);
			} else if(n3 > n2) {
				System.out.println("" + n1 + "" + n3 + "" + n2);
			}
		}
		if(n2 > n1 && n2 > n3) {
			if(n1 > n3) {
				System.out.println("" + n2 + " " + n1 + " " + n3);
			} else if(n3 > n1) {
				System.out.println("" + n2 + " " + n3 + " " + n1);
			}
		}
		if(n3 > n1 && n3 > n2) {
			if(n1 > n2) {
				System.out.println("" + n3 + " " + n1 + " " + n2);
			} else if(n2 > n1) {
				System.out.println("" + n3 + " " + n2 + " " + n1);
			}
		}
		
	}
}	
