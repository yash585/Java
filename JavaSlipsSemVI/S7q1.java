/*
Write a java program that implements a multi-thread application that has three threads.
First thread generates random integer number after every one second, if the number is
even; second thread computes the square of that number and print it. If the number is
odd, the third thread computes the of cube of that number and print it.
*/

import java.util.*;

class Root extends Thread
{
    Random r;
    int n;
    Root()
    {
        r=new Random();
        start();
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            n=r.nextInt(100);
            if(n%2==0)
            {
                new Square(n);
            }
            else
            {
                new Cube(n);
            }
            try
            {sleep(800);}
            catch(Exception e){}
        }
    }
    public static void main(String[] args)
    {
        new Root();
    }
}

class Square extends Thread
{
    int n;
    Square(int n)
    {
        this.n=n;
        start();
    }
    public void run()
    {
        System.out.println("Sqr:"+n+"::"+n*n);
    }
}
class Cube extends Thread
{
    int n;
    Cube(int n)
    {
        this.n=n;
        start();
    }
    public void run()
    {
        System.out.println("Cube:"+n+":: "+n*n*n);
    }
}