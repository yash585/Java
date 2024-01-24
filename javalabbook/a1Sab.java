import java.util.*;
class area
{
 public static void main(String arg[])
 {
  float l,b,a,p;
  Scanner sc=new Scanner(System.in);
  System.out.println("len & breadth");
  l=sc.nextFloat();
  b=sc.nextFloat();
  a=l*b;
  p=2*(l+b);
  System.out.println("Area="+a+"Perimeter="+p);
 }
}
