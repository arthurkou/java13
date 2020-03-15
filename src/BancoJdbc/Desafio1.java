package BancoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//consultar registros
public class Desafio1 {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome like ?";

		System.out.println("Consultar as letras: ");
		String letras = entrada.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + letras + "%");
		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			String nome = resultado.getString("nome");
			int codigo = resultado.getInt("código");
			pessoas.add(new Pessoa(codigo, nome));
		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + ">>>" + p.getNome());
		}

		stmt.close();
		conexao.close();

		entrada.close();
	}

}
