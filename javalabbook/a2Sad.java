import java.util.*;

class Name
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name::");
        String s=sc.nextLine();
        String name[]=s.split(" ",3);
        System.out.println(name[2]+" "+name[0]+" "+name[1]);
    }    
}