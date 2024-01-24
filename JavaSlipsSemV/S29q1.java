/*Write a program to create a class Customer(custno,custname,contactnumber,custaddr).
Write a method to search the customer name with given contact number and display the
details. */

import java.util.Scanner;

class Customer
{
    int custno;
    String custname,contno,custaddr;
    Scanner sc=new Scanner(System.in);

    Customer()
    {
        System.out.println("enter custno name contact no addr::");
        custno=sc.nextInt();
        custname=sc.next();
        contno=sc.next();
        custaddr=sc.next();
    }
    int search(String cno)
    {
        if(cno.equals(contno))
            return 1;
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit::");
        int n=sc.nextInt();
        Customer c[]=new Customer[n];
        for(int i=0;i<n;i++)
        {
            c[i]=new Customer();
        }
        System.out.println("enter contact no to search customer");
        String cno=sc.next();
        for(int i=0;i<n;i++)
        {
            if(c[i].search(cno)==1)
            {
                System.out.println("\nCustomer name::"+c[i].custname);
                break;
            }
        }
    }
}