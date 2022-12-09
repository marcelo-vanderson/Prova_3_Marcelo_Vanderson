package apresentacao;

import negocio.Usuario;
import persistencia.UsuarioDAO;

public class Main {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.Conexao();
		dao.consulta();
		
	

}}
