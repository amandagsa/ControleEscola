package model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.entity.Professor;
import util.Conexao;

public class ProfessorDAO {

	private Conexao conexao = new Conexao();
	private String query = "";

	public ProfessorDAO() throws SQLException, ClassNotFoundException {
	}

	public void addProfessor(Professor professor) throws SQLException {
		this.conexao.getConnection().setAutoCommit(false);
		query = "insert into professor (nomeProfessor, ativa) value (?, ?)";

		try {
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			statement.setString(1, professor.getNomeProfessor());
			statement.setBoolean(2, true);
			statement.execute();
			conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}
	}
	
	public void deleteProfessor(int codProfessor) throws SQLException {
		query = "delete from professor where codProfessor = (?)";
		try {
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			statement.setInt(1, codProfessor);
			statement.execute();
			conexao.commit();
		}catch(SQLException e) {
			this.conexao.rollback();
			throw e;
		}
	}
	
	public List <Professor> listarProfessores() throws SQLException{
		query = "select codProfessor, nomeProfessor from professor";
		try {
			List<Professor> listaProfessores = new ArrayList<>();
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Professor professorPesquisado = new Professor(resultSet.getInt("codProfessor"), resultSet.getString("nomeProfessor"), resultSet.getBoolean("ativo"));
				listaProfessores.add(professorPesquisado);
			}
			return listaProfessores;
		}catch(SQLException e) {
			this.conexao.rollback();
			throw e;
		}
		
	}
	
	public void alteraProfessor(Professor professor) throws SQLException {
		this.conexao.getConnection().setAutoCommit(false);
		query = "update professor set nomeProfessor = ?, ativa = ? where codProfessor = ?";

		try {
			PreparedStatement statement = this.conexao.getConnection().prepareStatement(query);
			statement.setString(1, professor.getNomeProfessor());
			statement.setBoolean(2, professor.isAtivo());
			statement.setInt(3, professor.getCodProfessor());
			statement.execute();
			conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}
	}
}