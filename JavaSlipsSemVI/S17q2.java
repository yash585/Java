/*Write a Multithreading program in java to display the number’s between 1 to 100
continuously in a TextField by clicking on button. (Use Runnable Interface) */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class onetohund extends JFrame implements ActionListener,Runnable
{
    JTextField j;
    JButton b;
    Thread th;
    onetohund()
    {
        th=new Thread(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        j=new JTextField(20);
        b=new JButton("start");
        add(j);
        add(b);
        b.addActionListener(this);        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
        {
            th.start();
        }
    }
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            j.setText(""+i);
            try
            {
                Thread.sleep(800);
            }
            catch(Exception e)
            {
                System.out.println("e");
            }
        }
    }
    public static void main(String[] args)
    {
        new onetohund();
    }
}