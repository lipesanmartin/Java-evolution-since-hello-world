package br.senac.rj.banco.teste;

import java.util.Scanner;

import br.senac.rj.banco.modelo.Conta;

public class TesteClasse1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta1 = new Conta();
		System.out.println("Informe a agência da conta:");
		int agencia = Integer.parseInt(sc.nextLine());
		conta1.setAgencia(agencia);
		System.out.println("Informe o número da conta:");
		int numero = Integer.parseInt(sc.nextLine());
		conta1.setAgencia(numero);
		conta1.setSaldo(1000); // valor para teste
		System.out.println("Escolha a operação:\n1 - Consultar\n2 - Depositar\n3 - Sacar\n4 - Encerrar");
		int escolha = Integer.parseInt(sc.nextLine());
		switch (escolha) {
		case 1:
			System.out.println("Saldo: R$" + conta1.getSaldo());
			break;
		case 2:
			System.out.println("Informe quanto quer depositar:");
			double deposito = Double.parseDouble(sc.nextLine());
			System.out.println("Valor do depósito: " + deposito);
			conta1.deposita(deposito);
			System.out.println("Saldo após o depósito: " + conta1.getSaldo());
			break;
		case 3:
			System.out.println("Informe quanto quer sacar:");
			double saque = Double.parseDouble(sc.nextLine());
			if (conta1.saca(saque))
				System.out.println("Saldo após o saque: " + conta1.getSaldo());
			else
				System.out.println("Não foi possível efetuar o saque. Saldo indisponível");
			break;
		case 4:
			System.out.println("Programa encerrado.");
			break;
		default:
			System.out.println("Erro. Operação não aceita");
		}
		sc.close();
	}
}
