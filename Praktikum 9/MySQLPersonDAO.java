import java.sql.*;
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        Class.forName("com.mysql.jbdc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root",""); // sesuai file yang ada
        String query = "INSERT INTO person(name) VALUE ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
        }
}