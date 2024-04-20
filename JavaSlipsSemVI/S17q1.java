/*Write a java program to accept ‘N’ integers from a user. Store and display integers in
sorted order having proper collection class. The collection should not accept duplicate
elements. */

import java.util.*;

class coll
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit: ");
        int n=sc.nextInt();
        TreeSet<Integer> t=new TreeSet<>();
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            t.add(sc.nextInt());
        }
        System.out.println(t);
        sc.close();
    }
}