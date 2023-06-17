package br.senac.rj.teste;

import java.util.Scanner;

public class TesteeExcecao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um numero inteiro: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Entre com um numero inteiro: ");
		int num2 = Integer.parseInt(sc.nextLine());
		double num3 = (double) num1 / num2;
		System.out.printf("O resultado da divisão de %d por %d é %.1f\n", num1, num2, num3);
		
		sc.close();
	}

}
