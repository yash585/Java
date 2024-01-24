/*Write a program to create a super class Vehicle having members Company and price.
Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle
(capacity_in_tons). Accept the information for "n" vehicles and display the information in
appropriate form. While taking data, ask user about the type of vehicle first. */

import java.util.Scanner;

class Vehicle
{
    String company;
    double price;
    Scanner sc=new Scanner(System.in);
    Vehicle()
    {
        System.out.println("Enter company and price:");
        company=sc.next();
        price=sc.nextDouble();
    }
}

class LightMotorVehicle extends Vehicle
{
    Scanner sc=new Scanner(System.in);
    int mileage;
    LightMotorVehicle()
    {
        super();
        System.out.println("Enter milage:");
        mileage=sc.nextInt();
    }
    void display()
    {
        System.out.println(company+"\t"+mileage+"\t"+price);
    }
}

class HeavyMotorVehicle extends Vehicle
{
    Scanner sc=new Scanner(System.in);
    int capacity;
    HeavyMotorVehicle()
    {
        super();
        System.out.println("Enter capacity in tons:");
        capacity=sc.nextInt();
    }
    void display()
    {
        System.out.println(company+"\t"+capacity+"\t"+price);
    }
}

class transport
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit");
        int n=sc.nextInt();
        int ch,lf=0,hf=0;
        LightMotorVehicle l[]=new LightMotorVehicle[n];
        HeavyMotorVehicle h[]=new HeavyMotorVehicle[n];
        do
        {
            System.out.println("Enter type of vehicle first:\n1.LMV\n2.HMV");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: for(int i=0;i<n;i++)
                        {
                            l[i]=new LightMotorVehicle();
                        }
                        lf=1;
                        break;
                
                case 2: for(int i=0;i<n;i++)
                        {
                            h[i]=new HeavyMotorVehicle();
                        }
                        hf=1;
                        break;
            }
        }while(ch<3);
        if(lf==1)
        {
            System.out.println("Comapany\tMilage\tPrice");
            for(int i=0;i<n;i++)
            {
                l[i].display();
            }
        }

        if(hf==1)
        {
            System.out.println("\nComapany\tMilage\tPrice");
            for(int i=0;i<n;i++)
            {
                h[i].display();
            }
        }
    }
}