/*Write a package for Operation, which has two classes, Addition and Maximum. Addition has
two methods add () and subtract (), which are used to add two integers and subtract two,
float values respectively. Maximum has a method max () to display the maximum of two
integers */

import java.util.Scanner;

import Operation.*;
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers::");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        Addition as=new Addition();
        Maximum m=new Maximum();
        c=as.add(a, b);
        System.out.println("Addition="+c);
        c=as.sub(a, b);
        System.out.println("Subtraction="+c);
        c=m.max(a, b);
        System.out.println("Maximum="+c);
    }
}