import java.sql.* ;
import java.util.Scanner;
public class PreparedStatementExample{
    public static void main(String args[])throws Exception{
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","") ;
            PreparedStatement stmt=con.prepareStatement("INSERT INTO user (name,age) VALUES(?,?);");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name");
            String name=sc.next();
            System.out.println("Enter age");
            int age=sc.nextInt();
            stmt.setString(1,name);
            stmt.setInt(2,age);
            int num=stmt.executeUpdate();
            System.out.println(num);

         
    }
}