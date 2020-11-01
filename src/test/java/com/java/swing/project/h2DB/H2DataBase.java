package com.java.swing.project.h2DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.java.swing.project.utility.H2JDBCUtils;

public class H2DataBase {

	public void createH2Table(String query) throws SQLException {

		//System.out.println(createTableSQL);
		// Step 1: Establishing a Connection
		try (Connection connection = H2JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				Statement statement = connection.createStatement();) {

			// Step 3: Execute the query or update query
			statement.execute(query);

		} catch (SQLException e) {
			// print SQL exception information
			H2JDBCUtils.printSQLException(e);
		}
	}

	public int insertRecord(String name, String email,String password, String country,String state, String phone) throws SQLException {
		int x=0;
		final String INSERT_USERS_SQL = "INSERT INTO empTable" +
				"  (name, email, password,country,state, pnone) VALUES " +
				" (?, ?, ?, ?,?,?);";
		System.out.println(INSERT_USERS_SQL);
		// Step 1: Establishing a Connection
		try (Connection connection = H2JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, country);
			preparedStatement.setString(5, state);
			preparedStatement.setString(6, phone);

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			preparedStatement.executeUpdate();
			x++;  
			if (x > 0)   
			{  
				return 1;  
			}  
		} catch (SQLException e) {

			// print SQL exception information
			H2JDBCUtils.printSQLException(e);

		}

		// Step 4: try-with-resource statement will auto close the connection.
		return -1;
	}

	public void readRecord(String QUERY) {
		try (Connection connection = H2JDBCUtils.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
			preparedStatement.setInt(1, 1);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String country = rs.getString("country");
				String state = rs.getString("state");
				String phone = rs.getString("pnone");
				System.out.println(id + "," + name + "," + email + "," + password + "," + country+ "," + state+ ","+phone );

			}
		} catch (SQLException e) {
			H2JDBCUtils.printSQLException(e);
		}
	}


	public void deleteRecord(String deleteTableSQL) throws SQLException {

		System.out.println(deleteTableSQL);
		// Step 1: Establishing a Connection
		try (Connection connection = H2JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				Statement statement = connection.createStatement();) {

			// Step 3: Execute the query or update query
			statement.execute(deleteTableSQL);

		} catch (SQLException e) {
			// print SQL exception information
			H2JDBCUtils.printSQLException(e);
		}
	}

}
