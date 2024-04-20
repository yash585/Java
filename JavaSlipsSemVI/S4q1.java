/*
Write a Java program using Runnable interface to blink Text on the frame.
*/

import java.awt.*;
import javax.swing.*;

class Blink extends JFrame implements Runnable
{
    JLabel t;
    Thread th;
    Blink()
    {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        t=new JLabel("BLINK");
        t.setFont(new Font("Utopia",1,100));
        t.setForeground(Color.MAGENTA);
        t.setVisible(false);
        
        add(t,BorderLayout.CENTER);
        this.pack();

        th=new Thread(this);
        th.start();

    }
    public void run()
    {
        while(true)
        {
            try{
                t.setVisible(true);
                Thread.sleep(400);
                t.setVisible(false);
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args)
    {
        new Blink();
    }
}