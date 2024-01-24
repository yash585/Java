class employee
{
    int eno;
    String ename,dept;
    double sal;
    static int count=0;
    employee()
    {
        eno=0;
        ename="";
        dept="";
        sal=0;
    }
    employee(int eno,String ename,String dept,double sal)
    {
        this.eno=eno;
        this.ename=ename;
        this.dept=dept;
        this.sal=sal;
        count++;
    }
    static int count()
    {
        return count;
    }
    void disp()
    {
        System.out.println(eno+"\t"+ename+"\t"+dept+"\t"+sal);
    }
    public static void main(String arg[])
    {
        System.out.println("\neno\tename\tdept\tsal\n");
        employee ob=new employee(101,"Unde","comp",30000);
        ob.disp();
        System.out.println("conut::"+employee.count());

        employee ob1=new employee(102,"Mhaske","Elc",32000);
        ob1.disp();
        System.out.println("conut::"+employee.count());

        employee ob2=new employee(103,"Joshi","Math",25000);
        ob2.disp();
        System.out.println("conut::"+employee.count());

        employee ob3=new employee(104,"Lande","comp",30000);
        ob3.disp();
        System.out.println("conut::"+employee.count());
    }
}