/*Write a program to create a package name student. Define class StudentInfo with method to
display information about student such as rollno, class, and percentage. Create another class
StudentPer with method to find percentage of the student. Accept student details like
rollno, name, class and marks of 6 subject from user. */

import Student.StudentPer;
import java.util.Scanner;


class StudentInfo
{
    int rno;
    String cls,name;
    double per;
    void accept()
    {
        StudentPer p=new StudentPer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rno name cls marks of 6 sub::");
        rno=sc.nextInt();
        name=sc.next();
        cls=sc.next();
        int mrk[]=new int[6];
        for(int i=0;i<6;i++)
            mrk[i]=sc.nextInt();
        per=p.percentage(mrk);
    }
    void disp()
    {
        System.out.println(rno+"\t"+name+"\t"+per);
    }
}

class xyz
{
    public static void main(String[] args) 
    {
        StudentInfo s=new StudentInfo();
        s.accept();
        s.disp();
    }
}
