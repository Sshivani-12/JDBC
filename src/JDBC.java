
import java.sql.*;
import java.util.*;
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
	{ 
	try{
	System.out.println("loading");
	   Class.forName("oracle.jdbc.OracleDriver");
	   System.out.println("driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:root","system","Shivani1211");
    String Query="select * from Emp";
    PreparedStatement pst=con.prepareStatement(Query);
       
	   ResultSet rs=pst.executeQuery();
       
	   System.out.println("now print");
		          
				while(rs.next())
				{
				System.out.println(rs.getInt(0));
					
				}
                con.close();
	}
	
			/*
     	
		System.out.println("connected");
		con.close();
		System.out.println("disconnected");
	
	}//          ///*while(rs.next())
                {
                System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+rs.getString(4));
                }*/
				

				catch(SQLException e)
				{
				System.out.println("error is :"+e);		
				}
				
				catch(ClassNotFoundException e)
				{
				System.out.println("cnfe is :"+e);		
				}
				
				
				
// rs.close();
// st.close();
 
 //con.close();
        // TODO code application logic here
    }
    
}
