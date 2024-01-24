/*Write a program to implement Border Layout Manager. */

import java.awt.*;

class Border extends Frame
{
    Button b1,b2,b3,b4,b5;
    Border()
    {
        setVisible(true);
        setSize(250,250);
        setLayout(new BorderLayout());
        b1=new Button("EAST");
        b2=new Button("WEST");
        b3=new Button("NORTH");
        b4=new Button("SOUTH");
        b5=new Button("CENTER");
        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.NORTH);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        Border b=new Border();
    }
}