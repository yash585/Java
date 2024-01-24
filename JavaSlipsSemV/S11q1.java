/*Define an interface “Operation” which has method volume( ).Define a constant PI having a value
3.142 Create a class cylinder which implements this interface (members – radius, height). Create
one object and calculate the volume. */

import java.util.Scanner;

interface Operation
{
    double volume();
    double PI=3.142;
}
class Cylinder implements Operation

{
    double r,h;
    Cylinder()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius & height");
        r=sc.nextDouble();
        h=sc.nextDouble();
    }
    public double volume()
    {
        return PI*r*r*h;
    }

    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        System.out.println("Volume of cylinder::"+c.volume());
    }
}