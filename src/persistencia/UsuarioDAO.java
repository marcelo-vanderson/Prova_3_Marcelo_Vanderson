package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import apresentacao.Main;
import negocio.Usuario;
import persistencia.Conexao;

public class UsuarioDAO {

	Connection conn;
	Statement st;

	public boolean Conexao() {
		try {
			Class.forName("com.mysql.jdbc.DriveManager");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Usuario", "root", "");
			st = conn.createStatement();

			return true;
		} catch (ClassNotFoundException e) {
			return false;

		} catch (Exception e) {

			return false;

		}

	}

	public ArrayList<Usuario> consulta() {
		ArrayList<Usuario> aux = new ArrayList<Usuario>();
		Usuario usuario;
		try {
			Connection conexao = new Conexao().getConexao();

			ResultSet resultado = conexao.prepareStatement("select * from usuario").executeQuery();

			while (resultado.next()) {
				usuario = new Usuario();
				usuario.setNome(resultado.getString("nome"));

				usuario.setEquipe1(resultado.getString("equipe1"));
				usuario.setPlacar1(resultado.getInt(("placar1")));

				usuario.setEquipe2(resultado.getString("equipe2"));
				usuario.setPlacar2(resultado.getInt(("equipe2")));

				usuario.setEquipe3(resultado.getString("equipe3"));
				usuario.setPlacar3(resultado.getInt(("equipe3")));

				usuario.setEquipe4(resultado.getString("equipe4"));
				usuario.setPlacar4(resultado.getInt(("equipe4")));

				usuario.setEquipe5(resultado.getString("equipe5"));
				usuario.setPlacar5(resultado.getInt(("equipe5")));

				usuario.setEquipe6(resultado.getString("equipe6"));
				usuario.setPlacar6(resultado.getInt(("equipe6")));

				usuario.setEquipe7(resultado.getString("equipe7"));
				usuario.setPlacar7(resultado.getInt(("equipe7")));

				usuario.setEquipe8(resultado.getString("equipe8"));
				usuario.setPlacar8(resultado.getInt(("equipe8")));

				aux.add(usuario);
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aux;
	}

	public void inserir(Usuario usuario) {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir = conexao
					.prepareStatement("insert into usuario (nome,equipe1, placar1,equipe2, placar2,equipe3, "
							+ "placar3,equipe4, placar4,equipe5, placar5,equipe6, placar6,equipe7,"
							+ " placar7,equipe8, placar8) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			inserir.setString(1, usuario.getNome());

			inserir.setString(2, usuario.getEquipe1());
			inserir.setInt(3, usuario.getPlacar1());

			inserir.setString(4, usuario.getEquipe2());
			inserir.setInt(5, usuario.getPlacar2());

			inserir.setString(6, usuario.getEquipe3());
			inserir.setInt(7, usuario.getPlacar3());

			inserir.setString(8, usuario.getEquipe4());
			inserir.setInt(9, usuario.getPlacar4());

			inserir.setString(10, usuario.getEquipe5());
			inserir.setInt(11, usuario.getPlacar5());

			inserir.setString(12, usuario.getEquipe6());
			inserir.setInt(13, usuario.getPlacar6());

			inserir.setString(14, usuario.getEquipe7());
			inserir.setInt(15, usuario.getPlacar7());

			inserir.setString(16, usuario.getEquipe8());
			inserir.setInt(17, usuario.getPlacar8());

			inserir.executeUpdate();
			conexao.close();

		} catch (SQLException e) {
//			e.printStackTrace();
			e.getErrorCode();
		}
	}

	public void atualizar(Usuario usuario) {

		try {
			Connection conexao = new Conexao().getConexao();
			PreparedStatement atualizar = conexao
					.prepareStatement("atualizar  usuario set equipe1=?,placar1=?,equipe2=?,"
							+ "placar2=? where equipe1=?" + ",placar1=?,equipe2=?,placar2=?");

			atualizar.setString(2, usuario.getEquipe1());
			atualizar.setInt(3, usuario.getPlacar1());

			atualizar.setString(4, usuario.getEquipe2());
			atualizar.setInt(5, usuario.getPlacar2());

//			atualizar.setString(6, usuario.getEquipe3());
//			atualizar.setInt(7, usuario.getPlacar3());
//
//			atualizar.setString(8, usuario.getEquipe4());
//			atualizar.setInt(9, usuario.getPlacar4());

			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deletar(Usuario usuario) {
		try {
			Connection conexao = new Conexao().getConexao();
			PreparedStatement deletar = conexao.prepareStatement("delete from usuario where nome=?,time1=?, placar1=?,"
					+ "time2=?, placar2=?,time3=?, placar3=?,time4=?, placar4=?,time5=?, placar5=?,time6=?, placar6=?,"
					+ "time6=?, placar6=?,time8=?, placar8=?");

			deletar.setString(1, usuario.getNome());

			deletar.setString(2, usuario.getEquipe1());
			deletar.setInt(3, usuario.getPlacar1());

			deletar.setString(4, usuario.getEquipe2());
			deletar.setInt(5, usuario.getPlacar2());

			deletar.setString(6, usuario.getEquipe3());
			deletar.setInt(7, usuario.getPlacar3());

			deletar.setString(8, usuario.getEquipe4());
			deletar.setInt(9, usuario.getPlacar4());

			deletar.setString(10, usuario.getEquipe5());
			deletar.setInt(11, usuario.getPlacar5());

			deletar.setString(12, usuario.getEquipe6());
			deletar.setInt(13, usuario.getPlacar6());

			deletar.setString(14, usuario.getEquipe7());
			deletar.setInt(15, usuario.getPlacar7());

			deletar.setString(16, usuario.getEquipe8());
			deletar.setInt(17, usuario.getPlacar8());

			deletar.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
