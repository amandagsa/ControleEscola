package model.entity;

import java.sql.SQLException;
import java.util.Date;

import model.DAO.AlunoDAO;

public class Aluno {
	private int codAluno;
	private String nomeAluno;
	private String cpfAluno;
	private Date dataNascimento;
	private Date dataMatricula;
	private String nomePai;
	private String nomeMae;
	private String responsavel;
	private String foneResponsavel;
	private boolean matriculado;
	
	public Aluno() {
	}
	
	public Aluno(int codAluno, String nomeAluno, String cpfAluno, Date dataNascimento, Date dataMatricula,
			String nomePai, String nomeMae, String responsavel, String foneResponsavel, boolean matriculado) {
		super();
		this.codAluno = codAluno;
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.dataNascimento = dataNascimento;
		this.dataMatricula = dataMatricula;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.responsavel = responsavel;
		this.foneResponsavel = foneResponsavel;
		this.matriculado = matriculado;
	}
	public int getCodAluno() {
		return codAluno;
	}
	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeALuno) {
		this.nomeAluno = nomeALuno;
	}
	public String getCpfAluno() {
		return cpfAluno;
	}
	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}	
	
	public String getFoneResponsavel() {
		return foneResponsavel;
	}

	public void setFoneResponsavel(String foneResponsavel) {
		this.foneResponsavel = foneResponsavel;
	}
	
	public boolean incluirAluno() {
		try {
			new AlunoDAO().addAluno(this);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public String toString() {
		return "Aluno [codAluno=" + codAluno + ", nomeAluno=" + nomeAluno + ", cpfAluno=" + cpfAluno
				+ ", dataNascimento=" + dataNascimento + ", dataMatricula=" + dataMatricula + ", nomePai=" + nomePai
				+ ", nomeMae=" + nomeMae + ", responsavel=" + responsavel + ", matriculado=" + matriculado
				+ ", getCodAluno()=" + getCodAluno() + ", getNomeAluno()=" + getNomeAluno() + ", getCpfAluno()="
				+ getCpfAluno() + ", getDataNascimento()=" + getDataNascimento() + ", getDataMatricula()="
				+ getDataMatricula() + ", getNomePai()=" + getNomePai() + ", getNomeMae()=" + getNomeMae()
				+ ", getResponsavel()=" + getResponsavel() + ", isMatriculado()=" + isMatriculado()
				+ ", incluirAluno()=" + incluirAluno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
