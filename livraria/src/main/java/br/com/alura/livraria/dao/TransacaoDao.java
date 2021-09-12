package br.com.alura.livraria.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.alura.livraria.modelo.Autores;

public class TransacaoDao {

	private Connection conexao;

	public TransacaoDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void cadastrar(Autores regtransgravar) {

		try {

			String sql = "insert into autores (nome,email,dtnascimento,minicurriculum) values(?,?,?,?)";

			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setString(1, regtransgravar.getNome());
			ps.setString(2, regtransgravar.getEmail());
			ps.setDate(3, Date.valueOf(regtransgravar.getDataNascimento()));
			ps.setString(4, regtransgravar.getMiniCurriculum());

			ps.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Autores> listar() {

		try {

			String sql = "select * from autores order by id desc";

			PreparedStatement ps = conexao.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			List<Autores> regsaida = new ArrayList<>();

			while (rs.next()) {

				Autores t = new Autores();

				t.setNome(rs.getString("nome"));
				t.setEmail(rs.getString("email"));
				t.setDataNascimento(rs.getDate("dtnascimento").toLocalDate());

				regsaida.add(t);

			}

			return regsaida;

		} catch (SQLException e) {

			throw new RuntimeException(e);
		}

	}

}
