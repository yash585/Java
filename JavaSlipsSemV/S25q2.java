/*Create the following GUI screen using appropriate layout manager. Accept the name, class,
hobbies from the user and display the selected options in a textbox. */

import java.awt.*;

import java.awt.event.*;

class Form extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1;
    Checkbox c1,c2,c3,c4,c5,c6;
    CheckboxGroup ch1;
    TextArea ta;
    Button b1;
    Form()
    {
        setVisible(true);
        setSize(200,300);
        setTitle("Form");
        setLayout(new FlowLayout());
        l1=new Label("Your Name");
        l2=new Label("Your class");
        l3=new Label("Your hobbies");
        t1=new TextField(10);
        ch1=new CheckboxGroup();
        c1=new Checkbox("FY",ch1,false);
        c2=new Checkbox("SY",ch1,false);
        c3=new Checkbox("TY",ch1,false);
        c4=new Checkbox("Music");
        c5=new Checkbox("Dance");
        c6=new Checkbox("Sports");
        ta=new TextArea();
        b1=new Button("Submit");
        add(l1);add(t1);
        add(l2);add(l3);
        add(c1);add(c2);add(c3);
        add(c4);add(c5);add(c6);
        add(b1);add(ta);
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String s="Name:";
            s=s+t1.getText()+"\n";
            ta.setText(s);

            if(c1.getState()==true)
            {
                s=s+"FY"+"\n";
                ta.setText(s);
            }
            if(c2.getState()==true)
            {
                s=s+"SY"+"\n";
                ta.setText(s);
            }
            if(c3.getState()==true)
            {
                s=s+"TY"+"\n";
                ta.setText(s);
            }
            if(c4.getState()==true)
            {
                s=s+"Music"+"\n";
                ta.setText(s);
            }
            if(c5.getState()==true)
            {
                s=s+"Dance"+"\n";
                ta.setText(s);
            }
            if(c6.getState()==true)
            {
                s=s+"Sports"+"\n";
                ta.setText(s);
            }
            
        }
    }
    public static void main(String[] args) {
        Form f=new Form();

    }
}