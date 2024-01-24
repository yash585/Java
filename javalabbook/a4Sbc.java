import java.util.*;
public class InvalidDate extends Exception
{
    public String toString()
    {
        return "DateIsInvalid";
    }
}
class MyDate
{
    Scanner sc=new Scanner(System.in);
    int day,month,year,f=0;
    void accept()
    {
        System.out.println("Enter day month year");
        day=sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
        try
        {
            if(month>=1 && month<=12)
            {
                if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
                {
                    if(day>=1 && day<=31)
                    {
                        f=1;
                    }
                    else 
                    {
                        throw new InvalidDate();
                    }
                }
                else if(month==4||month==6||month==4||month==11)
                {
                    if(day>=1 && day<=30)
                    {
                        f=1;
                    }
                    else 
                    {
                        throw new InvalidDate();
                    }
                }
                else if(month==2)
                {
                    if(year%4==0)
                    {
                        if(day>=1 && day<=29)
                        {
                            f=1;
                        }
                        else 
                        {
                        throw new InvalidDate();
                        }
                    }
                    else
                    {
                        if(day>=1 && day<=28)
                        {
                            f=1;
                        }
                        else 
                        {
                        throw new InvalidDate();
                        }
                    }
                }
            }
            else
            {
                throw new InvalidDate();
            }
        }
        catch(InvalidDate d)
        {
        }
    }
    void disp()
    {
        System.out.println("DD MM YYYY");
        System.out.println(day+"\t"+month+"\t"+year);
    }
}

class DemoMain
{
    public static void main(String ar[]) 
    {
        MyDate m=new MyDate();
        m.accept();
        if(m.f==1)
            m.disp();
    }
}