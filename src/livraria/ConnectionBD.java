package livraria;

import java.sql.*;
import javax.swing.*;

public class ConnectionBD {    
    
	private PreparedStatement stmt;
	private Connection con;
	public ResultSet rs;

	public ConnectionBD() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/people", "root", "19072000");

			JOptionPane.showMessageDialog(null, "Conectou ao banco");

		} catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "Não foi possível encontrar a classe" + ex);
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Não localizou dados" + erro);
		}

	}

	//MÉTODO PARA DESENVOLVEDOR
	public void updateBD(String query, int password) {
		if (password == 19072000) {
			try {

				stmt = con.prepareStatement(query);

				stmt.executeUpdate();

				JOptionPane.showMessageDialog(null, "Query executada.");
			} catch (SQLException erro) {
				JOptionPane.showMessageDialog(null, "Erro na execução da query.");
			}
		} else {
			JOptionPane.showMessageDialog(null,"Senha incorreta.");
		}
	}
	
	//MÉTODOS PARA O USUÁRIO
	public void addNewRow (String name, int age, int Peso) {
		try {

			stmt = con.prepareStatement("INSERT INTO person (name, age, Peso) VALUES ('"+name+"',"+age+","+Peso+")");

			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Linha adicionada.");
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro na adição da linha.");
		}
	}
	
	public void deleteRow (int idPerson) {
		try {

			stmt = con.prepareStatement("DELETE FROM person WHERE idPerson = "+idPerson+"");

			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Linha removida.");
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro na remoção da linha.");
		}
	}

	public void showAllTable() throws SQLException {

		int nR = 0;
		stmt = con.prepareStatement("select * from person");
		rs = stmt.executeQuery();

		while (rs.next()) {
			nR++;
			System.out.println("------------------------------");
			System.out.println("Nome: " + rs.getString("name"));
			System.out.println("Idade: " + rs.getString("age"));
			System.out.println("Peso: " + rs.getString("Peso"));
			System.out.println("ID: " + rs.getString("idPerson"));
			System.out.println("------------------------------");
		}

		System.out.println("Sua tabela possui " + nR + " registros.");

		rs.close();
	}

	public void showAColumn(String columnName) throws SQLException {
		int nR = 0;
		stmt = con.prepareStatement("select * from person");
		rs = stmt.executeQuery();
		while (rs.next()) {
			nR++;
			System.out.println("------------------------------");
			System.out.println(columnName + ": " + rs.getString(columnName));
			System.out.println("------------------------------");
		}
		System.out.println("Sua coluna possui " + nR + " registros.");
	}

	public void showARow(int idPerson) throws SQLException {
		stmt = con.prepareStatement("SELECT * From person where idPerson =" + idPerson + "");
		rs = stmt.executeQuery();
		rs.first();

		System.out.println("------------------------------");
		System.out.println("Nome: " + rs.getString("name"));
		System.out.println("Idade: " + rs.getString("age"));
		System.out.println("Peso: " + rs.getString("Peso"));
		System.out.println("ID: " + rs.getString("idPerson"));
		System.out.println("------------------------------");

	}
}

