/*
Write a Java program to accept ‘n’ integers from the user and store them in a collection.
Display them in the sorted order. The collection should not accept duplicate elements.
(Use a suitable collection). Search for a particular element using predefined search
method in the Collection framework.
*/

import java.util.*;

class Sort
{
    public static void main(String[] args) 
    {
        HashSet<Integer> h=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit");
        int n=sc.nextInt();
        System.out.println("Enters numbers:");
        for(int i=0;i<n;i++)
        {
            h.add(sc.nextInt());
        }
        System.out.println(h);
        System.out.println("Enter no to search");
        int no=sc.nextInt();
        if(h.contains(no))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("not Found");
        }
        sc.close();

    }
}