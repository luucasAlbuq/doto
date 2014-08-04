package br.com.restful.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * 
 * Classe responsável por conter os metodos criar e fechar o banco de dados.
 *
 * @author Lucas
 * @version 1.0
 */
public class ConnectionFactory {

	// Caminho do banco de dados.
	private static String URL = "jdbc:mysql://54.191.161.104/";
	private static String DB_NAME = "dotozin";
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USER_NAME = "doto";
	private static String PASSWORD = "doto12345";
	

	/**
	 * 
	 * Método responsável por criar uma conexao com o banco 
	 *
	 * @return
	 * @author Lucas
	 * @version 1.0
	 */
	public Connection criarConexao(){
		
		Connection conexao = null;
		
		try {
			
			Class.forName(DRIVER);
			conexao = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
		} catch (Exception e) {
			System.out.println("Erro ao criar conexão com o banco: " + URL);
			e.printStackTrace();
		}
		return conexao;
	}
	
	
	public void fecharConexao(Connection conexao, PreparedStatement pstmt, ResultSet rs){
		
		try {
			
			if(conexao != null){
				conexao.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(rs != null){
				rs.close();
			}
					
		} catch (Exception e) {
			System.out.println("Erro ao fechar conexão com o banco: " + URL);
		}
	}
}

