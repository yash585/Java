/*
Write a java program to define a thread for printing text on output screen for ‘n’
number of times. Create 3 threads and run them. Pass the text ‘n’ parameters to the
thread constructor.
Example:
    i.First thread prints “COVID19” 10 times.
    ii.Second thread prints “LOCKDOWN2020” 20 times
    iii.Third thread prints “VACCINATED2021” 30 times
*/

class Covid extends Thread
{
    int n;
    Covid(int n)
    {
        this.n=n;
        start();
    }
    synchronized public void run()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("COVID19");
        }
    }
}

class Lockdown extends Thread
{
    int n;
    Lockdown(int n)
    {
        this.n=n;
        start();
    }
    synchronized public void run()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("LOCKDOWN2020");
        }
    }

}
class Vaccin extends Thread
{
    int n;
    Vaccin(int n)
    {
        this.n=n;
        start();
    }
    synchronized public void run()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("VACCINATED2021");
        }
    }
}

class MD
{
    public static void main(String[] args)
    {
        new Covid(10);
        new Lockdown(20);
        new Vaccin(30);
    }
}