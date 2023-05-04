package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conntect {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement ps = Con.prepareStatement(
                "INSERT INTO `table_new`(`name`, `email`) VALUES ('Sanjay Sokal','sokalsanjay@gmail.com')");

        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("working");
        } else {
            System.out.println("failed");
        }

        // PreparedStatement ps = Con.prepareStatement("SELECT * FROM table_new");
        // ResultSet set = ps.executeQuery();
        // System.out.println(set.next());
    }
}
