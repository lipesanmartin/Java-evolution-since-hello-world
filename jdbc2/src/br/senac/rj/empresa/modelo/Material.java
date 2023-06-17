package br.senac.rj.empresa.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc1.Conexao;

public class Material {

	private Integer codMaterial;
	private String descMaterial;
	private Integer qtdeEstoque;

	public Material() {
	}

	public Material(Integer codMaterial, String descMaterial) {
		this.codMaterial = codMaterial;
		this.descMaterial = descMaterial;
	}

	public Integer getCodMaterial() {
		return codMaterial;
	}

	public void setCodMaterial(Integer codMaterial) {
		this.codMaterial = codMaterial;
	}

	public String getDescMaterial() {
		return descMaterial;
	}

	public void setDescMaterial(String descMaterial) {
		this.descMaterial = descMaterial;
	}

	public Integer getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void entrarMaterial(int quantidade) {
		qtdeEstoque += quantidade;
	}

	public boolean sairMaterial(int quantidade) {
		if (qtdeEstoque == 0) {
			System.out.println("Estoque vazio. Impossível remover");
			return false;
		}
		if ((qtdeEstoque - quantidade) <= 0) {
			System.out.println("Não há estoque suficiente!");
			return false;
		}
		qtdeEstoque -= quantidade;
		return true;
	}
	
	public boolean cadastrarMaterial(int codMaterial, String descMaterial) {
		// Define a conexão
		Connection conexao = null;
		try {
			conexao = Conexao.conectaBanco();
			// Define a consulta
			String sql = "insert into material set codigo=?, nome=?, quantidade=0;";
			// Prepara a consulta
			PreparedStatement ps = conexao.prepareStatement(sql);
			// Define os parâmetros da consulta
			ps.setInt(1, codMaterial); // Substitui o primeiro parâmetro da consulta pela agência informada
			ps.setString(2, descMaterial); // Substitui o segundo parâmetro da consulta pela conta informada
			int totalRegistrosAfetados = ps.executeUpdate();
			if (totalRegistrosAfetados == 0) {
				System.out.println("Não foi feito o cadastro!!");
				return false;
			}
			System.out.println("Cadastro realizado!");
			return true;
		} catch (SQLException erro) {
			System.out.println("Erro ao cadastrar a conta: " + erro.toString());
			return false;
		} finally {
			Conexao.fechaConexao(conexao);
		}
	}
	
	// continuar daqui criando os novos métodos
}
