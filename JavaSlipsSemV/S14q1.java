/*Write a program to accept a number from the user, if number is zero then throw user defined
exception “Number is 0” otherwise check whether no is prime or not (Use static keyword). */
import java.util.*;
class ZeroNumber extends Exception
{
    public String toString()
    {
        return "Number is zero";
    }
}

class Demo
{
    static void prime(int n)
    {
        int i;
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                break;
            }
        }
        if(i==n)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number not prime");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        try
        {
            if(n==0)
            {
                throw new ZeroNumber();
            }
            prime(n);
        }
        catch(ZeroNumber z)
        {
            System.out.println("Errorr::"+z);
        }
    }
}   