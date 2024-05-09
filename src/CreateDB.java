 import java.sql.* ;

import javax.naming.spi.DirStateFactory.Result;
 
 public class CreateDB{
    public static void main(String args []) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver") ;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","") ;
        Statement stmt =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
         ResultSet rs=stmt.executeQuery("select * from user");
         
       rs.absolute(3);
       System.out.println(rs.getString(2));
        // while(rs.next()){
        // System.out.println("The Name is "+rs.getString(2)+" Age is "+rs.getInt(3));
        // }
       //boolean flag = stmt.execute("CREATE TABLE USER( id  SERIAL PRIMARY KEY ,name VARCHAR(100),   age INTEGER );") ;
       //boolean flag = stmt.execute("INSERT INTO USER(name,age)VALUES('Dishit',19);");
       //System.out.println(flag);  
       int num= stmt.executeUpdate("UPDATE   User SET age=20 WHERE id=1 ;") ;
    //    System.out.println(num);
    //    stmt.addBatch("INSERT INTO USER (Name,Age)  VALUES('Harsh',19);");
    //    stmt.addBatch("INSERT INTO USER(Name,Age) VALUES('Jack',20);");
    //    int []result=stmt.executeBatch();

    //    for (int i:result){
    //     System.out.println(i);
    //    }
     } 
 }