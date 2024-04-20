/*
Write a java program for the following:
    i. To create a Product(Pid, Pname, Price) table.
    ii. Insert at least five records into the table.
    iii. Display all the records from a table.
*/

/*
insert into project values(101,'hotel',30000);
insert into project values(102,'tour',50000);
insert into project values(103,'mcq',10000);
insert into project values(104,'nursery',20000);
insert into project values(105,'Dairy',50000);
*/

import javax.swing.*;
import java.sql.*;
import java.util.Vector;

class Project extends JFrame
{
    Connection con;
    Statement st;
    ResultSet rs;
    JTable t;
    JScrollPane js;
    Project()
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
            JOptionPane.showMessageDialog(this, e);
        }
        try
        {
            st.execute("create table project(pid serial,pname text,price float)");
        }catch(Exception e){}
        
        Vector<String> head=new Vector<>();
        head.add("Project ID");
        head.add("Project Name");
        head.add("price");

        Vector<Vector> record=new Vector<>();
        try
        {
            rs=st.executeQuery("select * from project");

            while(rs.next())
            {
                Vector<String> r1=new Vector<>();
                r1.add(rs.getString(1));
                r1.add(rs.getString(2));
                r1.add(rs.getString(3));
                record.add(r1);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);    
        }

        t=new JTable(record,head);
        js=new JScrollPane(t);
        js.setBounds(100,100,500,150);
        add(js);
    }
    public static void main(String[] args) 
    {
        new Project();
    }
}