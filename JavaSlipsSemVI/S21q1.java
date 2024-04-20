/*Write a java program to accept ‘N’ Subject Names from a user store them into
LinkedList Collection and Display them by using Iterator interface. */
import java.util.*;

class Subject
{
    public static void main(String[] args)
    {
        LinkedList<String> l=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit:");
        int n=sc.nextInt();
        System.out.println("Enter sub names:");
        for(int i=0;i<n;i++)
        {
            l.add(sc.next());
        }

        System.out.println("\nSubject names:");
        ListIterator<String> ls=l.listIterator();
        while(ls.hasNext())
        {
            System.out.println(ls.next());
        }
        sc.close();
    }
}