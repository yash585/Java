import java.util.*;
class Student
{
    int rno;
    String name;
    float per;
    Scanner sc=new Scanner(System.in);

    void accept(int rno,String name,float per)
    {
        this.rno=rno;
        this.name=name;
        this.per=per;
    }


    void disp()
    {
        System.out.println(rno+"\t"+name+"\t"+per);
    }
    static void sortStud(Student s[],int n)
    {
        Student temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[i].per<s[j].per)
                {
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
    }

    public static void main(String arg[])
    {
        int rno;
        String name;
        float per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit for students::");
        int n=sc.nextInt();
        Student ob[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Student();
            System.out.println("Ether rno name per::");
            rno=sc.nextInt();
            name=sc.next();
            per=sc.nextFloat();
            ob[i].accept(rno,name,per);
        }
        System.out.println("Rno\tname\tper\n");
        for(int i=0;i<n;i++)
        {
            ob[i].disp();
        }

        Student.sortStud(ob,n);
        
        System.out.println("Rno\tname\tper\n");
        for(int i=0;i<n;i++)
        {
            ob[i].disp();
        }
    }
}