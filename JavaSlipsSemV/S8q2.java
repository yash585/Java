/*Design a screen to handle the Mouse Events such as MOUSE_MOVED
and MOUSE_CLICKED and display the position of the Mouse_Click in a TextField. */

import java.awt.*;
import java.awt.event.*;

class slip extends Frame implements MouseListener
{    
    TextField t;
    slip()
    {
        setVisible(true);
        setSize(300,400);
        setLayout(new FlowLayout());
        t=new TextField(20);
        add(t);
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseReleased(MouseEvent me)
    {}
    public void mouseClicked(MouseEvent me)
    {
        int x=me.getX();
        int y=me.getY();
        String text="x:"+x+"  y:"+y;
        t.setText(text);
    }
    public void mouseExited(MouseEvent me)
    {}

    public static void main(String[] args) {
        slip ob=new slip();
    }
}