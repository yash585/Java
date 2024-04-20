/*Write a Java program to accept the details of Teacher (TNo, TName, Subject). Insert at
least 5 Records into Teacher Table and display the details of Teacher who is teaching
“JAVA” Subject. (Use PreparedStatement Interface) */
//

import java.util.*;
import java.sql.*;

class Teacher
{
    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    Teacher()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost/exam","postgres","1234");
            st=con.createStatement();
            pst=con.prepareStatement("insert into teacher values(?,?,?)");
            st.executeUpdate("drop table teacher");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            st.execute("create table teacher(tno int,tname text,sub text)");
        }
        catch(Exception e){}

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("enter teacher no, name, subject:");
            int tno=sc.nextInt();
            String tname=sc.next();
            String sub=sc.next();
            try
            {
                pst.setInt(1,tno);
                pst.setString(2,tname);
                pst.setString(3,sub);
                pst.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        try
        {
            rs=st.executeQuery("select * from teacher");
            System.out.println("\nTNO\t|\tTName\t|\tSub");
            System.out.println("----------------------------------------");
            while(rs.next())
            {
                if(rs.getString(3).equals("java") || rs.getString(3).equals("Java"))
                {
                    System.out.println(rs.getString(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        sc.close();

    }
    public static void main(String[] args) 
    {
        new Teacher();
    }
}