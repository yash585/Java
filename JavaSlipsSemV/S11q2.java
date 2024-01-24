import java.util.Scanner;

class InvalidUser extends Exception
{
    public String toString()
    {
        return "UserName is Invalid";
    }
}
class InvalidPassword extends Exception
{
    public String toString()
    {
        return "Password is Invalid";
    }
}

class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String user="yash",pass="yash2003";
        System.out.println("Enter username & password::");
        String usr=sc.next();
        String pwd=sc.next();
        try
        {
            if(!usr.equals(user))
                throw new InvalidUser();
            if(!pwd.equals(pass))
                throw new InvalidPassword();

            System.out.println("Login sucessful...");
        }
        catch(InvalidUser u)
        {
            System.out.println("Error:"+u);
        }
        catch(InvalidPassword p)
        {
            System.out.println("Error:"+p);
        }
    }
} 