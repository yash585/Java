/*Write a program for multilevel inheritance such that Country is inherited from Continent.
State is inherited from Country. Display the place, State, Country and Continent. */

import java.util.Scanner;

class Continent
{
    String continent;
}
class Country extends Continent
{
    String country;
}
class State extends Country
{
    String state;
}
class Place extends State
{
    String place;
    Scanner sc=new Scanner(System.in);
    Place()
    {
        System.out.println("Enter continent country state place");
        continent=sc.next();
        country=sc.next();
        state=sc.next();
        place=sc.next();
    }
    void disp()
    {
        System.out.println("Continent\tCountry\t\tState\t\tPlace");
        System.out.println(continent+"\t\t"+country+"\t\t"+state+"\t"+place);
    }

}
class Display
{
    public static void main(String[] args) 
    {
        Place ob=new Place();
        ob.disp();
    }
}