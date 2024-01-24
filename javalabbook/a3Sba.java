import java.util.*;

abstract class order
{
    int id;
    String desc;

}

class PurchaceOrder extends order
{
    String cust_name;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter id desc cust_name");
        super.id=sc.nextInt();
        super.desc=sc.next();
        cust_name=sc.next();
    }
    void disp()
    {
        System.out.println(super.id+"\t"+super.desc+"\t"+cust_name);
    }
}
class SalesOrder extends order
{
    String vend_name;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter id desc vend_name");
        super.id=sc.nextInt();
        super.desc=sc.next();
        vend_name=sc.next();
    }
    void disp()
    {
        System.out.println(super.id+"\t"+super.desc+"\t"+vend_name);
    }
}
class Md
{
    public static void main(String arg[])
    {
        PurchaceOrder p[]=new PurchaceOrder[3];
        SalesOrder s[]=new SalesOrder[3];
        System.out.println("Enter purchace order details::");
        for(int i=0;i<3;i++)
        {
            p[i]=new PurchaceOrder();
            p[i].accept();
        }

        System.out.println("Enter Sales order details::");
        for(int i=0;i<3;i++)
        {
            s[i]=new SalesOrder();
            s[i].accept();
        }


        System.out.println("ID\tDesripiton\tCust name");
        for(int i=0;i<3;i++)
            p[i].disp();

        System.out.println("\nID\tDesripiton\tCust name");
        for(int i=0;i<3;i++)
            s[i].disp();
    }
}