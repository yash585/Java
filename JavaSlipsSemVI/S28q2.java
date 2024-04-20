/*Write a java program to display name of currently executing Thread in multithreading */

class Current
{
    public static void main(String[] args) 
    {
        System.out.println("name:"+Thread.currentThread().getName());
    }
}