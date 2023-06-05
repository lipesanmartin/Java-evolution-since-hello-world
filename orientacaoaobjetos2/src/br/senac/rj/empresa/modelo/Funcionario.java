package br.senac.rj.empresa.modelo;

public class Funcionario {
	private int registro;
	private String nome;
	private int cargo;
	private double salario;

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double aplicarBonificacao(double salario) {
		double novoSalario;
		switch (cargo) {
		case 1:
			novoSalario = this.salario * 1.2;
			return novoSalario;
		case 2:
			novoSalario = this.salario * 1.4;
			return novoSalario;
		case 3:
			novoSalario = this.salario * 1.6;
			return novoSalario;
		default:
			return this.salario;
		}
	}
}
