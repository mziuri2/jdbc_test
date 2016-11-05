
package ge.mziuri.jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Runner {
    
    public static void main(String[] args) {
        
        try {
//            Class.forName("org.postgresql.Driver");
//            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "rame");
//            System.out.println("კავშირი დამყარდა");
//            Statement stmt = con.createStatement();
//            stmt.execute("CREATE TABLE country(id INT PRIMARY KEY NOT NULL, name VARCHAR(30) NOT NULL);");
//            stmt.executeUpdate("INSERT INTO country VALUES(1, 'საქართველო');");
//            stmt.executeUpdate("INSERT INTO country VALUES (2, 'Հայաստան'), (3, 'England');");
//            ResultSet rs = stmt.executeQuery("SELECT * FROM country");
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                System.out.println(id + " " + name);
//            }
//            int id = 4;
//            String name = "Росси́я";
//            stmt.executeUpdate("INSERT INTO country VALUES(" + id + ",'" + name + "');");
//            PreparedStatement pstmt = con.prepareStatement("INSERT INTO country VALUES(?,?);");
//            pstmt.setInt(1, id);
//            pstmt.setString(2, name);
//            pstmt.executeUpdate();
//            stmt.close();
//            pstmt.close();
//            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
