package BancoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirRegistro {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe o código: ");
		int codigo = entrada.nextInt();
		entrada.close();

		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome, código) VALUES (?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);		
		stmt.setString(1, nome);
		stmt.setInt(2, codigo);
//		stmt.setInt(2, 10); //para definir o número do código(3), e segunda parametro
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso");

	}

}
