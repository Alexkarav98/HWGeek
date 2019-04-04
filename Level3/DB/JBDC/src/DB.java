import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.*;

public class DB {


    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();

            statement.executeQuery("SELECT * FROM Workers where id > 0 ");
            statement.executeUpdate("DELETE * FROM Workers where Salary < 399");
            int rows = statement.executeUpdate("\"CREATE TABLE users \"\n" +
                    "                    + \"(id INT(5) NOT NULL AUTO_INCREMENT,\"\n" +
                    "                    + \" username VARCHAR(50), \"\n" +
                    "                    + \"PRIMARY KEY(id));\";")
            statement.executeUpdate("UPDATE workers" +
                    "SET salary = 500 ");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("DB");
        connection = DriverManager.getConnection("jbdc:sqlite:HWdb.db");

    }
    public static void disconnect(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
