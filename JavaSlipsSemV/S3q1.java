/*Write a program to accept n name of cities from the user and sort them in ascending
order. */

import java.util.Scanner;

class cities
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit::");
        int n=sc.nextInt();
        String s[]=new String[n];
        System.out.println("Enter name of cities:");
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        String temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[i].compareTo(s[j])>0)
                {
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println("\n\nAfter sorting::");
        for(int i=0;i<n;i++)
            System.out.println(s[i]);
    }
}