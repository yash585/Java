/*Write a Java program to create a Package “SY” which has a class SYMarks (members –
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a
class TYMarks (members – Theory, Practicals). Create ‘n’ objects of Student class (having
rollNumber, name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects
and calculate the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50, Pass Class for > =40
else‘FAIL’) and display the result of the student in proper format. */

import java.util.Scanner;
import SY.*;
import TY.*;
class Student
{
    Scanner sc=new Scanner(System.in);
    int rno;
    String name,grd;
    SYMarks sy;
    TYMarks ty;
    float m;
    Student()
    {
        System.out.println("Enter rno name:");
        rno=sc.nextInt();
        name=sc.next();
        sy=new SYMarks();
        ty=new TYMarks();
    }
    void calculate()
    {
        m=(sy.comp_tot+ty.practical+ty.theory)/3;
        if(m>=70)
            grd="A";
        if(m>=60 && m<70)
            grd="B";
        if(m>=50 && m<60)
            grd="C";
        if(m>=40 && m<50)
            grd="PASS";
        if(m<40)
            grd="FAIL";
    
    }
    void disp()
    {
        System.out.println(rno+"\t"+name+"\t"+sy.comp_tot+"\t"+sy.math_tot+"\t"+sy.elc_tot+"\t"+ty.theory+"\t"+ty.practical+"\t\t"+grd);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("lim for students:");
        int n=sc.nextInt();
        Student ob[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Student();
            ob[i].calculate();
        }
        System.out.println("Roll no\tname\tcomp\tmath\telc\ttheory\tPractical\tGrade");
        for(int i=0;i<n;i++)
        {
            ob[i].disp();
        }
    }

}