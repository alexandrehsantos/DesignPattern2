package br.com.ale.cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		try{
		Connection conexao;
		String tipoBanco = System.getenv("tipoBAnco");
		if("mysql".equals(tipoBanco)){
			conexao = DriverManager.getConnection("jdbc://mysql://localhost:3306/banco","root","1234");
		} else{
			conexao = DriverManager.getConnection("jdbc:postgres://localhost:3306/banco", "root", "1234");
		}
			return conexao;
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}