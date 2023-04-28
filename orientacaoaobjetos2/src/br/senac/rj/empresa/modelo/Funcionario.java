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
		double bonificacao;
		switch (cargo) {
		case 1:
			bonificacao = this.salario * 0.2;
			novoSalario = this.salario + bonificacao;
			return novoSalario;
		case 2:
			bonificacao = this.salario * 0.4;
			novoSalario = this.salario + bonificacao;
			return novoSalario;
		case 3:
			bonificacao = this.salario * 0.6;
			novoSalario = this.salario + bonificacao;
			return novoSalario;
		default:
			return this.salario;
		}
	}
}
