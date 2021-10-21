package model.entity;

public class Disciplina {
	private int codDisicplina;
	private int codProfessor;
	private String descDisicplina;
	private int cargaHoraria;
	private boolean ativa;
	
	
	public int getCodDisicplina() {
		return codDisicplina;
	}
	public void setCodDisicplina(int codDisicplina) {
		this.codDisicplina = codDisicplina;
	}
	public int getCodProfessor() {
		return codProfessor;
	}
	public void setCodProfessor(int codProfessor) {
		this.codProfessor = codProfessor;
	}
	public String getDescDisicplina() {
		return descDisicplina;
	}
	public void setDescDisicplina(String descDisicplina) {
		this.descDisicplina = descDisicplina;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	
	
	
}
