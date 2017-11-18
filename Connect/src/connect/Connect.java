/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Connect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn=null;
        String username="SHAHARYARSHAMSHI";
        String password="shahbazshamshi";
        String url="jdbc:mysql://localhost/cookbook?useSSL=false";
        try
        {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           conn=DriverManager.getConnection(url, username, password);
           System.out.println("connected");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    
        try
        {
          
                    // Statement s=conn.createStatement();
                     
                     //s.executeUpdate("INSERT INTO limbs(thing,legs,arms)VALUES('rahul',1,0)");
                     //s.executeUpdate("Insert Into limbs(thing,legs,arms)values(null,0,0)");
                     PreparedStatement p;
                     p=conn.prepareStatement("INSERT INTO limbs(thing,legs,arms)"+"VALUES(?,?,?)");
                    // System.out.println("enter the no.");
                     Scanner in=new Scanner(System.in);
                     //int n=in.nextInt();
                     //p.setInt(1, n);
                     String thing=in.next();
                     int legs=in.nextInt();
                     int arms=in.nextInt();
                     p.setString(1, thing);
                     p.setInt(2,legs);
                     p.setInt(3, arms);
                     p.execute();
                    // p.executeQuery("SELECT Distinct thing,legs,arms from limbs order by legs DESC limit 20 ");
                     p.executeQuery("select thing,upper(thing)");
                     ResultSet rs=p.getResultSet();
                     Statement s=conn.createStatement();
                     s.executeUpdate("INSERT Into shahzeb select *from limbs where legs=0");
                     

        // s.executeQuery("Select thing,arms,legs from limbs where legs=0");
          // ResultSet rs=s.getResultSet();
           while(rs.next())
           {
               System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
           }

           rs.close();
           p.close(); 
            s.executeQuery("SELECT distinct thing ,legs,arms from shahzeb order by arms  limit 20 ");
            ResultSet w=s.getResultSet();
            System.out.println("w");
            while(w.next())
            {
                System.out.println(w.getString(1)+" "+w.getInt(2)+" "+w.getInt(3));
                
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
       
           if(conn!=null)
        {
            try
            {
            conn.close();
            System.out.println("Disconnected");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
    }
        
}
