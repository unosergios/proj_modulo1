package br.com.alura.livraria.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class GeraConexaoBco {
	
	public Connection getConexaoComBco() {
		
		try {
			
				String url = "jdbc:mysql://localhost:3306/livraria?useSSL=false&serverTimezone=UTC";
				String usuario = "root";
		    	String senha = "root";							
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conexao = DriverManager.getConnection(url, usuario, senha);
				
				return conexao;					
			
        } catch (Exception e) {  
			throw new RuntimeException(e);
         }
		}

}
