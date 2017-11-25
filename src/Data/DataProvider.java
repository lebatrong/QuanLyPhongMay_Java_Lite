
package Data;

/**
 *
 * @author batro
 */
import java.io.File;
import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class DataProvider {

    File Directory = new File("");
    String pathConnection=Directory.getAbsolutePath()+"/data/Connection.txt";
    
    public Connection Get_Connection()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            FileReader fr= new FileReader(pathConnection);
                
            int i;

            String c="";

            do{
                i=fr.read();
                c+=(char)i;
            }while(i!=-1);

            String a[]= c.split(" ");

            String url="jdbc:mysql://" + a[0]+":"+a[1] +"/qlpm";

            con= DriverManager.getConnection(url,a[2],a[3]);
            
            if(con!=null)
                System.out.println("Kết nối thành công!");
            
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
        }
        return con;   
    }
    
    public Connection Get_Connection_Master()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            FileReader fr= new FileReader(pathConnection);
                
            int i;

            String c="";

            do{
                i=fr.read();
                c+=(char)i;
            }while(i!=-1);

            String a[]= c.split(" ");

            String url="jdbc:mysql://" + a[0]+":"+a[1] +"/";

            con= DriverManager.getConnection(url,a[2],a[3]);
            
            if(con!=null)
                System.out.println("Kết nối thành công!");
            
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
        }
        return con;  
    }
    
    public ResultSet Get_Data(String query) throws SQLException
    {
        ResultSet rs=null;
        try{
            
            Statement st= Get_Connection().createStatement();
            
            rs= st.executeQuery(query);
            
            Get_Connection().close();
            
            return rs;
            
        }catch(Exception ex)
        {
            System.out.print(ex.toString());
            return null;
        }
    }
    
    public boolean Exec_Query(String Query)
    {
        try {
            
            int i;
            Statement st= Get_Connection().createStatement();
            
            i = st.executeUpdate(Query);
            
            Get_Connection().close();
            
            if(i==0)
                return false;
            else
                return true;
            
        } catch (Exception e) {
           return false;
        }
        
    }
    
//    public void Call_SP(String Query)
//    {
//        try {
//            
//            CallableStatement ctstm= Get_Connection().prepareCall(Query);
//            
//        } catch (Exception e) {
//       
//        }
//    }
    
    
    
}
