package br.senac.rj.teste;

import java.util.Scanner;

public class TesteClasseScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um nome: ");
		String nome = sc.nextLine();
		System.out.println("Entre com a nota 1: ");
		double nota1 = Double.parseDouble(sc.nextLine());
		System.out.println("Entre com a nota 2: ");
		double nota2 = Double.parseDouble(sc.nextLine());
		double media = (nota1 + nota2) / 2;
		System.out.println("A média do aluno " + nome + " é " + media);
		sc.close();

	}

}
