package TY;

import java.util.Scanner;

public class TYMarks
{
    Scanner sc=new Scanner(System.in);
    public int theory,practical;
    public TYMarks()
    {
        System.out.println("Enter theory practical mrk");
        theory=sc.nextInt();
        practical=sc.nextInt();
        
    }
    public void disp()
    {
        System.out.println(theory+"\t"+practical);
    }
}
