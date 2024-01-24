import java.util.Scanner;

interface Operation
{
    double pi=3.14;
    double area();
    double volume();
}

class Cylinder implements Operation
{
    double r,h;
    Cylinder(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
    double area()
    {
        return 2*pi*r*(r+h);
    }
    double volume()
    {
        return pi*r*r*h;
    }
}
class Xyz
{
        public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius and height");
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        Cylinder ob=new Cylinder(r,h);
        double a=ob.area();
        double v=ob.volume();
        System.out.println("Area::"+a+"\nVolume::"+v);
        }
}