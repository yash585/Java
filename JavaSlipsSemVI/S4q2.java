/*
Write a Java program to store city names and their STD codes using an appropriate
collection and perform following operations:
    i.Add a new city and its code (No duplicates)
    ii.Remove a city from the collection
    iii.Search for a city name and display the code
*/

import java.util.*;

class city
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> h=new HashMap<>();
        h.put("Shrirampur",1234);
        h.put("pune",1736);
        h.put("ahmednagar",678);
        h.put("kopargaon",1894);
        System.out.println(h);
        h.remove("pune");
        System.out.println(h);
        System.out.println("Enter City name to search");
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        if(h.containsKey(c))
        {
            System.out.println("code="+h.get(c));
        }
        else
        {
            System.out.println("not found");
        }
        sc.close();
    }
}