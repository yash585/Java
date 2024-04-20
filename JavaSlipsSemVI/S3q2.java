/*
Write a Java program to create LinkedList of String objects and perform the following:
    i.Add element at the end of the list
    ii.Delete first element of the list
    iii.Display the contents of list in reverse order
*/

import java.util.*;

class linked
{
    public static void main(String[] args) 
    {
        LinkedList<String> l=new LinkedList<>();
        l.add("yash");
        l.add("varad");
        l.add("adesh");
        l.add("bhappi");
        System.out.println(l);

        l.addLast("sky");
        System.out.println(l);

        l.removeFirst();
        System.out.println(l);

        Collections.reverse(l);
        System.out.println(l);
    
    }
}