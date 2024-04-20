/*
Write a java program to simulate traffic signal using threads.
*/

import javax.swing.*;
import java.awt.*;

class Traffic extends JFrame implements Runnable
{
    JPanel p1,p2,p3;
    Thread th;
    Traffic()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(800,600));
        setLayout(null);

        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();

        p1.setBackground(Color.RED);
        p1.setBounds(200,100,40,40);
        p1.setVisible(false);
        
        p2.setBackground(Color.YELLOW);
        p2.setBounds(200,160,40,40);
        p2.setVisible(false);
        
        p3.setBackground(Color.GREEN);
        p3.setBounds(200,220,40,40);
        p3.setVisible(false);
        
        add(p1);
        add(p2);
        add(p3);

        th=new Thread(this);
        th.start();

        setVisible(true);
        this.pack();
    }
    public void run()
    {
        while(true)
        {
            try
            {
                p1.setVisible(true);
                Thread.sleep(800);
                p1.setVisible(false);
                
                p2.setVisible(true);
                Thread.sleep(800);
                p2.setVisible(false);
                
                p3.setVisible(true);
                Thread.sleep(800);
                p3.setVisible(false);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args)
    {
        new Traffic();
    }
}