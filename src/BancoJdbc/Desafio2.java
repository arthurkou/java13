package BancoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//alterar nome
public class Desafio2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o código da pessoa: ");
		int codigo = entrada.nextInt();
		
		String select = "SELECT * FROM pessoas WHERE código = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE código = ?";
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();			
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		}
		
		conexao.close();
		entrada.close();
	}	
}

	/*
	 * public static void main(String[] args) throws SQLException { Scanner entrada
	 * = new Scanner(System.in);
	 * 
	 * Connection conexao = FabricaConexao.getConexao(); String select =
	 * "SELECT * from pessoas where nome = 'Carlos'";
	 * 
	 * System.out.println("Novo nome: "); String nome = entrada.nextLine();
	 * 
	 * PreparedStatement stmt = conexao.prepareStatement(select); ResultSet
	 * resultado = stmt.executeQuery();
	 * 
	 * String update = "UPDATE pessoas SET nome = ? WHERE código = 2";
	 * PreparedStatement stmt2 = conexao.prepareStatement(update);
	 * stmt2.setString(1, nome);
	 * 
	 * stmt2.execute();
	 * 
	 * System.out.println("Novo incluído com sucesso!"); entrada.close(); }
	 */
