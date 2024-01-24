package SY;

import java.util.Scanner;

public class SYMarks
{
    Scanner sc=new Scanner(System.in);
    public int comp_tot,math_tot,elc_tot;
    public SYMarks()
    {
        System.out.println("Enter comp total math total elc total:");
        comp_tot=sc.nextInt();
        math_tot=sc.nextInt();
        elc_tot=sc.nextInt();
    }
    public void disp()
    {
        System.out.println(comp_tot+"\t"+math_tot+"\t"+elc_tot);
    }
}
