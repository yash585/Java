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
class Officestaff extends Staff
{
    String dept;
    Officestaff(int id,String name,String dept)
    {
        super(id,name);
        this.dept=dept;
    }
    void disp()
    {
        System.out.println(id+"\t"+name+"\t"+dept);
    }
}

class Abstractcls
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lim");
        int n=sc.nextInt();
        Officestaff ob[]=new Officestaff[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter id name and dept::");
            int id=sc.nextInt();
            String name=sc.next();
            String dept=sc.next();
            ob[i]=new Officestaff(id, name, dept);
        }
        for(int i=0;i<n;i++)
            ob[i].disp();
    }
}