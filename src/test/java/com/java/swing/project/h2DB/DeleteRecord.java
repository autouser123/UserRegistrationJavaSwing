package com.java.swing.project.h2DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.swing.project.utility.H2JDBCUtils;

public class DeleteRecord {
    private static final String deleteTableSQL = "delete from empTable where name = ''";

    public static void main(String[] argv) throws SQLException {
        DeleteRecord deleteExample = new DeleteRecord();
        deleteExample.deleteRecord();
    }

    public void deleteRecord() throws SQLException {

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
