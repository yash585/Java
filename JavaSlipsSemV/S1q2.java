/*Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all details.*/

import java.util.Scanner;

abstract class Staff
{
    protected int id;
    protected String name;
    Staff(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}

class OfficeStaff extends Staff
{
    String dept;
    OfficeStaff(int id,String name,String dept)
    {
        super(id,name);
        this.dept=dept;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit:: ");
        int n=sc.nextInt();
        OfficeStaff ob[]=new OfficeStaff[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter id name dept");
            int id=sc.nextInt();
            String name=sc.next();
            String dept=sc.next();
            ob[i]=new OfficeStaff(id,name,dept);
        }
        System.out.println("ID\tName\tDept");
        for(int i=0;i<n;i++)
            System.out.println(ob[i].id+"\t"+ob[i].name+"\t"+ob[i].dept);
    }
}