package model.entity;

import java.sql.SQLException;

import model.DAO.ProfessorDAO;

public class Professor {
	private int codProfessor;
	private String nomeProfessor;
	private boolean ativo;
	
	
	public Professor(int codProfessor, String nomeProfessor, boolean ativo) {
		this.codProfessor = codProfessor;
		this.nomeProfessor = nomeProfessor;
		this.ativo = ativo;
	}
	
	public Professor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	public int getCodProfessor() {
		return codProfessor;
	}
	public void setCodProfessor(int codProfessor) {
		this.codProfessor = codProfessor;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean incluirProfessor() {
			try {
				new ProfessorDAO().addProfessor(this);
				return true;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
	}
}
