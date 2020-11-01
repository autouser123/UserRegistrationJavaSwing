package com.java.swing.project.h2DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.swing.project.utility.H2JDBCUtils;

/**
 * Update PreparedStatement JDBC Example
 * @author Ramesh Fadatare
 *
 */
public class UpdateRecord {

    private static final String UPDATE_USERS_SQL = "update employee set name = ? where id = ?;";

    public static void main(String[] argv) throws SQLException {
        UpdateRecord updateStatementExample = new UpdateRecord();
        updateStatementExample.updateRecord();
    }

    public void updateRecord() throws SQLException {
        System.out.println(UPDATE_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = H2JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setString(1, "Manish");
            preparedStatement.setInt(2, 1);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            H2JDBCUtils.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
