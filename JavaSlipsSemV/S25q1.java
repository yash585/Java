/*Create a class Student(rollno, name ,class, per), to read student information from the console
and display them (Using BufferedReader class) */

import java.io.*;

class Student
{
    int rno;
    String name,cls;
    double per;
    Student(int rno,String name,String cls,double per)
    {
        this.rno=rno;
        this.name=name;
        this.cls=cls;
        this.per=per;
    }
    void display()
    {
        System.out.println("rno\tname\tcls\tper");
        System.out.println(rno+"\t"+name+"\t"+cls+"\t"+per);
    }
    public static void main(String[] args) throws Exception
    {
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(i);
        System.out.println("Enter rno name cls per:");
        int rno=Integer.parseInt(b.readLine());
        String name=b.readLine();
        String cls=b.readLine();
        double per=Double.parseDouble(b.readLine());
        Student s=new Student(rno, name, cls, per);
        s.display();
    }
}