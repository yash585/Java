/*Write a Java Program to create a PROJECT table with field’s project_id, Project_name,
Project_description, Project_Status. Insert values in the table. Display all the details of
the PROJECT table in a tabular format on the screen.(using swing).*/


/*
create table project(project_id int,name text,description text,status text);
insert into project values(1,'project','will be ready in 2025','in progress');
*/


import javax.swing.*;
import java.sql.*;
import java.util.*;

class DispProject extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    DispProject()
    {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(null);

        try
        {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost/exam","postgres","1234");
            st=con.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        Vector<String> head=new Vector<>();
        Vector<Vector> record=new Vector<>();
        head.add("pno");
        head.add("pname");
        head.add("desc");
        head.add("status");
        
        try
        {
            rs=st.executeQuery("select * from dispproject");
            while(rs.next())
            {
                Vector<String> r1=new Vector<>();
                r1.add(rs.getString(1));
                r1.add(rs.getString(2));
                r1.add(rs.getString(3));
                r1.add(rs.getString(4));
                record.add(r1);
            }
        }
        catch(Exception e)
        {}

        JTable j=new JTable(record,head);
        JScrollPane js=new JScrollPane(j);
        js.setBounds(100,100,400,150);
        add(js);

    }
    public static void main(String[] args)
    {
        new DispProject();
    }

}