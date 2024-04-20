/*Write a java program to create a TreeSet, add some colors (String) and print out the
content of TreeSet in ascending order. */

import java.util.*;

class ColorTree
{
    public static void main(String[] args) 
    {
        TreeSet<String> t=new TreeSet<>();
        t.add("pink");
        t.add("blue");
        t.add("yellow");
        t.add("white");
        
        System.out.println(t);

    }
}