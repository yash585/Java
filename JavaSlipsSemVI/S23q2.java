/*Write a java program to accept ‘N’ student names through command line, store them
into the appropriate Collection and display them by using Iterator and ListIterator
interface */

import java.util.*;

class command
{
    public static void main(String[] args)
    {
        int i=0;
        LinkedList<String> l=new LinkedList<>();
        try
        {
            while(args[i]!=null)
            {
                l.add(args[i]);
                i++;
            }
        }
        catch(Exception e){}

        ListIterator<String> ls=l.listIterator();
        
        while(ls.hasNext())
        {
            System.out.println(ls.next());
        }
    }
}