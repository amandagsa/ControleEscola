package model.entity;

public class Notas {
	private int codNota;
	private int codAluno;
	private int codDisciplina;
	private Double vlrNota;
	
	
	public int getCodNota() {
		return codNota;
	}
	public void setCodNota(int codNota) {
		this.codNota = codNota;
	}
	public int getCodAluno() {
		return codAluno;
	}
	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}
	public int getCodDisciplina() {
		return codDisciplina;
	}
	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	public Double getVlrNota() {
		return vlrNota;
	}
	public void setVlrNota(Double vlrNota) {
		this.vlrNota = vlrNota;
	}

}
