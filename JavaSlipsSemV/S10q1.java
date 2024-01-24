/*Write a program to find the cube of given number using functional interface. */

interface xyz
{
    int cube(int n);
}

class test implements xyz
{
    public int cube(int n)
    {
        return n*n*n;
    }

    public static void main(String[] args) 
    {
        test x=new test();
        int c=x.cube(5);
        System.out.println("cube::"+c);
    }
}