/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountingsystem2;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author HP
 */
// A class for jdbc connection
public class InitConnection {
    public static  Connection initcon()
    {
        Connection con=null;
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Open");
            
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accountingsystem","root","Gaurav@123");
            System.out.println("Connection Done");
            
            
        }catch(Exception tt)
        {
         System.out.println(tt);
        }
     return con;
    }
}
