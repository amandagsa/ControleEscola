package model.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import model.entity.Aluno;
import util.Conexao;

public class AlunoDAO {

	private Conexao conexao = new Conexao();
	private String query = "";

	public AlunoDAO() throws SQLException, ClassNotFoundException {
	}

	public void addAluno(Aluno aluno) throws SQLException {
		query = "insert into aluno (nomeAluno, cpfAluno, dataNascimento, dataMatricula, nomePai, nomeMae, responsavel, foneResponsavel, matriculado) values (?,?,?,?,?,?,?,?,?)";
		LocalDate dataNasc = aluno.getDataNascimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		try {
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			statement.setString(1, aluno.getNomeAluno());
			statement.setString(2, aluno.getCpfAluno());
			statement.setDate(3, Date.valueOf(dataNasc));
			statement.setDate(4, Date.valueOf(LocalDate.now()));
			statement.setString(5, aluno.getNomePai());
			statement.setString(6, aluno.getNomeMae());
			statement.setString(7, aluno.getResponsavel());
			statement.setString(8, aluno.getFoneResponsavel());
			statement.setBoolean(9, false);
			statement.execute();
			conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}
	}

	public void deletaAluno(int codAluno) throws SQLException {
		query = "delete from aluno where codAluno = ?";
		try {
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			statement.setInt(1, codAluno);
			statement.execute();
			conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}
	}

	public List<Aluno> listarAlunos() throws SQLException {
		query = "select codAluno, nomeAluno, cpfAluno, dataNascimento, dataMatricula, nomePai, nomeMae, responsavel, matriculado from aluno";
		try {
			List<Aluno> listaAlunos = new ArrayList<>();
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Aluno alunoPesquisado = new Aluno(resultSet.getInt("codAluno"), resultSet.getString("nomeAluno"),
						resultSet.getString("cpfAluno"), resultSet.getDate("dataNascimento"),
						resultSet.getDate("dataMatricula"), resultSet.getString("nomePai"),
						resultSet.getString("nomeMae"), resultSet.getString("responsavel"), 
						resultSet.getString("foneResponsavel"), resultSet.getBoolean("matriculado"));
				listaAlunos.add(alunoPesquisado);
			}
			return listaAlunos;
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}

	}

	public void alteraAluno(Aluno aluno) throws SQLException {
		query = "update aluno set nomeAluno = ?, cpfAluno = ?, dataNascimento = ?, dataMatricula = ?, nomePai = ?, nomeMae = ?, responsavel = ?, matriculado = ? where codAluno = ?)";
		LocalDate dataNasc = aluno.getDataNascimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		try {
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			statement.setString(1, aluno.getNomeAluno());
			statement.setString(2, aluno.getCpfAluno());
			statement.setDate(3, Date.valueOf(dataNasc));
			statement.setDate(4, Date.valueOf(LocalDate.now()));
			statement.setString(5, aluno.getNomePai());
			statement.setString(6, aluno.getNomeMae());
			statement.setString(7, aluno.getResponsavel());
			statement.setBoolean(8, aluno.isMatriculado());
			statement.setInt(9, aluno.getCodAluno());
			statement.execute();
			conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}
	}

	public Aluno pesquisaAluno() throws SQLException {
		query = "select codAluno, nomeAluno, cpfAluno, dataNascimento, dataMatricula, nomePai, nomeMae, responsavel, matriculado from aluno";
		try {
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Aluno alunoPesquisado = new Aluno(resultSet.getInt("codAluno"), resultSet.getString("nomeAluno"),
						resultSet.getString("cpfAluno"), resultSet.getDate("dataNascimento"),
						resultSet.getDate("dataMatricula"), resultSet.getString("nomePai"),
						resultSet.getString("nomeMae"), resultSet.getString("responsavel"),
						resultSet.getString("foneRssponsavel"), resultSet.getBoolean("matriculado"));
				return alunoPesquisado;
			} else {
				return null;
			}

		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}

	}

}
