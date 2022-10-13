package testes;

import java.sql.Connection;
import java.sql.SQLException;

import dao.ProdutoDAO;
import factory.ConnectionFactory;
import modelo.Produto;

public class TestaInsercaoComProdutoDAO {
	
	public static void main(String[] args) throws SQLException {
		
		Produto comoda = new Produto("Ventilador", "Phillips");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO persistenciaProduto = new ProdutoDAO(connection);
			persistenciaProduto.salvar(comoda);			
		}
	}	
}
