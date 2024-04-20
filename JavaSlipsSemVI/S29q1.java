/*Write a Java program to display information about all columns in the DONAR table
using ResultSetMetaData */

import java.sql.*;

class metadata
{
    Connection con;
    Statement st;
    ResultSet rs;
    ResultSetMetaData rmd;
    metadata()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost/exam", "postgres", "1234");
            st=con.createStatement();
        }
        catch(Exception e)
        {System.out.println(e);}
        try
        {
            rs=st.executeQuery("select * from project");
            rmd=rs.getMetaData();
        }
        catch(Exception e)
        {System.out.println(e);}
        try
        {
            int n=rmd.getColumnCount();
            for(int i=1;i<n;i++)
            {
                System.out.print("Name:"+rmd.getColumnName(i));
                System.out.println("\tType:"+rmd.getColumnTypeName(i));
            }
        }
        catch(Exception e){System.out.println(e);}
    }
    public static void main(String[] args)
    {
        new metadata();
    }
}