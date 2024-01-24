import java.util.Scanner;

import operation.*;
class Demo
{
    public static void main(String arg[])
    {
        String s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        Conca c=new Conca();
        Comp cm=new Comp();
        System.out.println("Enter two strings");
        s1=sc.next();
        s2=sc.next();
        s3=c.concat(s1, s2);
        System.out.println("Concatnatin of strings::"+s3);
        if(cm.compare(s1, s2))
        {
            System.out.println("Strings are equal");
        }
        else
            System.out.println("Strings are not equal");

    }
}