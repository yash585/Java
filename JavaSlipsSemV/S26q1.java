/*Define a Item class (item_number, item_name, item_price). Define a default and parameterized
constructor. Keep a count of objects created. Create objects using parameterized constructor
and display the object count after each object is created.(Use static member and method). Also
display the contents of each object. */

import java.util.Scanner;

class Item
{
    int ino;
    String iname;
    double price;
    static int cnt=0;
    Item()
    {
        ino=0;
        iname="";
        price=0.0;
    }
    Item(int ino,String iname,double price)
    {
        this.ino=ino;
        this.iname=iname;
        this.price=price;
    }
    static void disp(Item ob[],int n)
    {
        System.out.println("I_No\tItem name\tPrice");
        for(int i=0;i<n;i++)
        {
            System.out.println(ob[i].ino+"\t"+ob[i].iname+"\t"+ob[i].price);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit:");
        int n=sc.nextInt();
        Item ob[]=new Item[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter item no item name price");
            int ino=sc.nextInt();
            String iname=sc.next();
            double price=sc.nextDouble();
            ob[i]=new Item(ino, iname, price);
            cnt++;
            System.out.println("Object count::"+cnt);
        }
        disp(ob, n);
    }
}