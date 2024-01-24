import SY.*;
import TY.*;
import java.util.*;

class Student
{
    int rno;
    String name;
    SYMarks sy;
    TYMarks ty;
    Student(int rno,String name,SYMarks sy,TYMarks ty)
    {
        this.rno=rno;
        this.name=name;
        this.sy=sy;
        this.ty=ty;
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter rno name sy and ty marks");
            int rno=sc.nextInt();
            String name=sc.next();
            
        }
    }
}