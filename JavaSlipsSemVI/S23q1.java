/*Write a java program to accept a String from a user and display each vowel from a
String after every 3 seconds */

import java.util.*;

class vowel extends Thread
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                System.out.print(s.charAt(i)+"  ");
                try
                {Thread.sleep(3000);}
                catch(Exception e){System.out.println(e);}
            }
        }
        sc.close();
    }
}