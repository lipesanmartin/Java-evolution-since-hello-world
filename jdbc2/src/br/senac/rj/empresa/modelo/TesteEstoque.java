package br.senac.rj.empresa.modelo;

import java.util.Scanner;

public class TesteEstoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Material material = new Material();
		int codMaterial; 
		String descMaterial;
		boolean resultado;
		do {
			System.out.println("1 - Cadastrar conta");
			System.out.println("2 - Consultar conta");
			System.out.println("3 - Atualizar conta");
			System.out.println("4 - Encerrar");
			System.out.print("Entre com uma opção: ");
			int opcao = Integer.parseInt(sc.nextLine());
			if (opcao < 1 || opcao > 4)
				System.out.println("Opção incorreta!");
			else {
				
			}
			
		
		sc.close();
	}

}
