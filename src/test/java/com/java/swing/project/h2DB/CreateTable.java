package com.java.swing.project.h2DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.swing.project.utility.H2JDBCUtils;

/**
 * Create Statement JDBC Example
 * @author Ramesh Fadatare
 *
 */
public class CreateTable {

   /* private static final String createTableSQL = "create table employee (\r\n" + "  id  int(3) primary key,\r\n" +
        "  name varchar(20),\r\n" + "  email varchar(20),\r\n" +
        "  password varchar(20),\r\n" +  "  country varchar(20),\r\n" 
        +  "  state varchar(20),\r\n" +  "  pnone varchar(20),\r\n"+ 
        "  );";*/
    private static final String createTableSQL = "create table empTable (\r\n" +"  name varchar(20),\r\n" +
    		"  email varchar(20),\r\n" +
            "  password varchar(20),\r\n" +  "  country varchar(20),\r\n" 
            +  "  state varchar(20),\r\n" +  "  pnone varchar(20),\r\n"+ 
            "  );";

    public static void main(String[] argv) throws SQLException {
    	CreateTable createTableExample = new CreateTable();
        createTableExample.createH2Table();
    }

    public void createH2Table() throws SQLException {

        System.out.println(createTableSQL);
        // Step 1: Establishing a Connection
        try (Connection connection = H2JDBCUtils.getConnection();
            // Step 2:Create a statement using connection object
            Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(createTableSQL);

        } catch (SQLException e) {
            // print SQL exception information
            H2JDBCUtils.printSQLException(e);
        }
    }
}