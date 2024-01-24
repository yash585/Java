import java.util.*;
class Continent
{
    String cont_name;
}

class Country extends Continent
{
    String c_name;
}

class State extends Country
{
    String s_name,place;
    
    State(String cont_name,String c_name,String s_name,String place)
    {
        this.cont_name=cont_name;
        this.c_name=c_name;
        this.s_name=s_name;
        this.place=place;
    }

    void disp()
    {
        System.out.println("Continent\tCountry\tState\tPlace");
        System.out.println(cont_name+"\t\t"+c_name+"\t"+s_name+"\t"+place);
    }
}

class Md
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter continent,country,state,place");
        String cont_name=sc.next();
        String c_name=sc.next();
        String s_name=sc.next();
        String place=sc.next();
        State ob=new State(cont_name,c_name,s_name,place);
        ob.disp();
    }
}