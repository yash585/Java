import java.util.*;
class demo
{
  void armstrong(int n)
  {
   int d=0,s=0,t=n;
   while(n>0)
   {
    d=n%10;
    s+=d*d*d;
    n=n/10;
   }
   if(s==t)
    System.out.println("Armstrong");
   else
    System.out.println("not Armstrong");
  }

  public static void main(String arg[])
  {
   demo d=new demo();
   Scanner sc=new Scanner(System.in);
   System.out.print("enter no:");
   int n=sc.nextInt();
   d.armstrong(n);
  }
}
