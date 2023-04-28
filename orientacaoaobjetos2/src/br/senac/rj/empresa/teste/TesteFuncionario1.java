package br.senac.rj.empresa.teste;

import br.senac.rj.empresa.modelo.Funcionario;

import java.util.Scanner;

public class TesteFuncionario1 {

	public static void main(String[] args) {
		String continuar;
		Scanner sc = new Scanner(System.in);
		do {
			Funcionario func1 = new Funcionario();

			System.out.println("Insira o registro do Funcionário:");
			func1.setRegistro(Integer.parseInt(sc.nextLine()));
			System.out.println("Insira o nome do Funcionário:");
			func1.setNome(sc.nextLine());
			System.out.println("Insira o Cargo do Funcionário:");
			func1.setCargo(Integer.parseInt(sc.nextLine()));
			System.out.println("Insira o salário do Funcionário:");
			func1.setSalario(Double.parseDouble(sc.nextLine()));
			double novoSalario = func1.aplicarBonificacao(func1.getSalario());
			System.out.println("Registro: " + func1.getRegistro());
			System.out.println("Nome: " + func1.getNome());
			System.out.println("Cargo: " + func1.getCargo());
			System.out.println("Salario: R$" + func1.getSalario());
			System.out.println("De acordo com seu cargo, a bonificação será R$" + (novoSalario - func1.getSalario()));
			System.out.println("Salario com bonificação: R$" + novoSalario);
			do {
				System.out.println("Deseja continuar (S/N)?");
				continuar = sc.nextLine();
			} while (continuar.equalsIgnoreCase("s") == false && continuar.equalsIgnoreCase("n") == false);

		} while (continuar.toUpperCase().equals("S"));
		sc.close();
		System.out.println("Finalizado.");

	}

}
