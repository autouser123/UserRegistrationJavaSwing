package com.java.swing.project.h2DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.swing.project.utility.H2JDBCUtils;

/**
 * Insert PrepareStatement JDBC Example
 * 
 * @author Ramesh Fadatare
 *
 */
public class InsertRecord {
    private static final String INSERT_USERS_SQL = "INSERT INTO employee" +
        "  (id, name, email, password,country,state, pnone) VALUES " +
        " (?, ?, ?, ?, ?,?,?);";

    public static void main(String[] argv) throws SQLException {
        InsertRecord createTableExample = new InsertRecord();
        createTableExample.insertRecord();
    }

    public void insertRecord() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = H2JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1,4);
            preparedStatement.setString(2, "rahul");
            preparedStatement.setString(3, "rahul@gmail.com");
            preparedStatement.setString(4, "rahul123");
            preparedStatement.setString(5, "India");
            preparedStatement.setString(6, "M.H");
            preparedStatement.setString(7, "8767323");

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            H2JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
