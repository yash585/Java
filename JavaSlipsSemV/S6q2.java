/*Create an abstract class “order” having members id, description. Create two subclasses
“Purchase Order” and “Sales Order” having members customer name and Vendor name
respectively. Define methods accept and display in all cases. Create 3 objects each of Purchase
Order and Sales Order and accept and display details. */

import java.util.Scanner;

import javax.management.openmbean.OpenType;

abstract class Order
{
    int id;
    String desc;
}
class PurchaseOrder extends Order
{
    Scanner sc=new Scanner(System.in);
    String cust_name;
    void accept()
    {
        System.out.println("Enter id description cust_name");
        id=sc.nextInt();
        desc=sc.next();
        cust_name=sc.next();
    }
    void disp()
    {
        System.out.println(id+"\t"+desc+"\t"+cust_name);
    }
}
class SalesOrder extends Order
{
    Scanner sc=new Scanner(System.in);
    String vend_name;
    void accept()
    {
        System.out.println("enter id description vend name");
        id=sc.nextInt();
        desc=sc.next();
        vend_name=sc.next();
    }

    void disp()
    {
        System.out.println(id+"\t"+desc+"\t"+vend_name);
    }

}

class Shop
{
    public static void main(String[] args) 
    {
        PurchaseOrder p[]=new PurchaseOrder[3];
        SalesOrder s[]=new SalesOrder[3];
        for(int i=0;i<3;i++)
        {
            p[i]=new PurchaseOrder();
            p[i].accept();
        }
        for(int i=0;i<3;i++)
        {
            s[i]=new SalesOrder();
            s[i].accept();
        }
        System.out.println("Purchase order::");
        for(int i=0;i<3;i++)
        {
            p[i].disp();
        }
        System.out.println("Sales order::");
        for(int i=0;i<3;i++)
        {
            s[i].disp();
        }

    }
}