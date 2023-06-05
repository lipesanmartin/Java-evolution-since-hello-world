package br.senac.rj.teste;

public abstract class Conta {
	private int agencia;
	private int numero;
	private String titular;
	protected double saldo;
	public static int totalContas;

	Conta() {
		this.titular = "";
		totalContas++;
	}

	Conta(int numAgencia, int numConta) {
		this();
		this.agencia = numAgencia;
		this.numero = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public abstract boolean saca(double valor);
	
	

}
