/*
Write a java program to display name and priority of a Thread.
*/

class TD extends Thread
{
    TD()
    {
        System.out.println("Name:"+this.getName()+"\tPriority:"+this.getPriority());        
    }
}

class Priotity extends Thread
{
    public static void main(String[] args)
    {
        Thread th=new Thread();
        System.out.println("Name:"+th.getName()+"\tPriority:"+th.getPriority());
        new TD();
    }
}