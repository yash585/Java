/*Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString(). */

import java.util.Scanner;

class Employee
{
    int empid;
    String name,designation;
    double sal;
    Employee(int empid,String name,String desugnation,double sal)
    {
        this.empid=empid;
        this.name=name;
        this.designation=desugnation;
        this.sal=sal;
    }
    public String toString()
    {
        return empid+"\t"+name+"\t"+designation+"\t"+sal;        
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id name desg sal");
        int id=sc.nextInt();
        String name=sc.next();
        String desg=sc.next();
        double sal=sc.nextDouble();
        Employee ob=new Employee(id, name, desg, sal); 
        System.out.println(ob);       
    }
}