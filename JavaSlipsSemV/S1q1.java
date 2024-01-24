/*Write a Program to print all Prime numbers in an array of ‘n’ elements.
(use command line arguments)*/

import java.util.*;

class Prime
{
    public static void main(String args[]) 
    {
        int j,i=0,n=0;
        int l=args.length;
        int a[]=new int[l];
        for(i=0;i<l;i++)
            a[i]=Integer.parseInt(args[i]);

        for(i=0;i<l;i++)
        {
            for(j=2;j<=a[i];j++)
            {
                if(a[i]%j==0)
                    break;
            }
            if(j==a[i])
                System.out.println("No is prime: "+a[i]);
            else
                System.out.println("Not prime: "+a[i]);
        }
    }
}
