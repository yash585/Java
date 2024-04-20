/*Write a java program to accept ‘N’ Integers from a user store them into LinkedList
Collection and display only negative integers. */

import java.util.*;

class negative
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> l=new LinkedList<>();
        int x;
        System.out.println("limit:");
        int n=sc.nextInt();
        System.out.println("enter integers");
        for(int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        System.out.println("\nnegative elements");
        ListIterator<Integer> ls=l.listIterator();
        while(ls.hasNext())
        {
            if((x=ls.next())<0)
            {
                System.out.println(x);
            }
        }
        sc.close();
    }
}