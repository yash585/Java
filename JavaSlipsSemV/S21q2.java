/*Create an employee class(id,name,deptname,salary). Define a default and parameterized
constructor. Use ‘this’ keyword to initialize instance variables. Keep a count of objects
created. Create objects using parameterized constructor and display the object count after
each object is created. (Use static member and method). Also display the contents of each
object. */

import java.util.Scanner;

class Employee
{
    int id;
    String name,deptname;
    double salary;
    static int cnt=0;
    Employee()
    {
        id=0;
        name="";
        deptname="";
        salary=0.0;
    }
    Employee(int id,String name,String deptname,double salary)
    {
        this.id=id;
        this.name=name;
        this.deptname=deptname;
        this.salary=salary;
    }
    static void display(Employee e[],int n)
    {
        for(int i=0;i<n;i++)
            System.out.println(e[i].id+"\t"+e[i].name+"\t"+e[i].deptname+"\t"+e[i].salary);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit:");
        int n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter id name deptname salary");
            int id=sc.nextInt();
            String name=sc.next();
            String deptname=sc.next();
            double sal=sc.nextDouble();
            e[i]=new Employee(id, name, deptname, sal);
            cnt++;
            System.out.println("Object count::"+cnt);
        }
        display(e,n);
    }
}