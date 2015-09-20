import java.sql.*;
public class DBC
{
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/vistas";
    
    static final String USER="phpuser";
    static final String PASS="tomcat2015";
    
    public static void main(String[] args)
    {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to DB...");
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            String sql;
            sql="SELECT * FROM schools";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                String sid=rs.getString("sid");
                String name=rs.getString("name");
                System.out.println(sid+" "+name);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt!=null)
                    stmt.close();
                if(conn!=null)
                    conn.close();
            }
            catch(SQLException se2)
            {
                se2.printStackTrace();
            }
            System.out.println("GoodBye");
        }
    }
}