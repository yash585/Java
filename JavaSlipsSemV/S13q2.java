import java.text.SimpleDateFormat;
import java.util.*;
class Mydate
{
    public static void main(String[] args)
    {
        String s;
        Date d=new Date();
        SimpleDateFormat sd;
        sd=new SimpleDateFormat("dd/MM/yyyy");
        s=sd.format(d);
        System.out.println("Current date is:"+s);

        sd=new SimpleDateFormat("dd-MM-yyyy");
        s=sd.format(d);
        System.out.println("Current date is:"+s);

        sd=new SimpleDateFormat("EEEE MMMM dd yyyy");
        s=sd.format(d);
        System.out.println("Current date is:"+s);
        
        sd=new SimpleDateFormat("EE MMMM dd hh:mm:ss z yyyy");
        s=sd.format(d);
        System.out.println("Current date is:"+s);

        sd=new SimpleDateFormat("dd-mm-yy hh:mm:ss");
        s=sd.format(d);
        System.out.println("Current date is:"+s);
    }
}
