/*Write a program to create parent class College(cno, cname, caddr) and derived class
Department(dno, dname) from College. Write a necessary methods to display College details. */

import java.util.Scanner;

class College
{

    int cno;
    String cname,caddr;
}

class Department extends College
{
    int dno;
    String dname;
    Scanner sc=new Scanner(System.in);
    Department()
    {
        System.out.println("Enter Cno Cname Caddr");
        cno=sc.nextInt();
        cname=sc.next();
        caddr=sc.next();
        System.out.println("Enter dno dname");
        dno=sc.nextInt();
        dname=sc.next();
    }
    void disp()
    {
        System.out.println(cno+"\t"+cname+"\t"+caddr+"\t"+dno+"\t"+dname);
    }
}

class Test
{
    public static void main(String[] args) 
    {
        Department ob=new Department();
        System.out.println("cno\tcname\tcaddr\t\tdno\tdname");
        ob.disp();
    }
}