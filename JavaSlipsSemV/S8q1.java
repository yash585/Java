/*Create a class Sphere, to calculate the volume and surface area of sphere.
(Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r)) */

import java.util.Scanner;

class Sphere
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        double r=sc.nextDouble();
        double a,v;
        a=4*3.14*(r*r);
        v=(4f/3f)*3.14*(r*r*r);
        System.out.println("Area="+a+"\nvolume="+v);
    }
}