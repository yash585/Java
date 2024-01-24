class MyNumber
{
    int n;
    MyNumber()
    {
        n=0;
    }
    MyNumber(int n)
    {
        this.n=n;
    }
    boolean isNegative()
    {
        if(n<0)
            return true;
        else
            return false;
    }
    boolean isPositive()
    {
        if(n>0)
            return true;
        else
            return false;
    }
    boolean isEven()
    {
        if(n%2==0)
            return true;
        else
            return false;
    }
    boolean isOdd()
    {
        if(n%2!=0)
            return true;
        else
            return false;
    }
    boolean isZero()
    {
        if(n==0)
            return true;
        else
            return false;
    }
    public static void main(String arg[]) 
    {
        int n=-2;//Integer.parseInt(arg[0]);
        MyNumber ob=new MyNumber(n);
        if(ob.isEven())
          System.out.println("No is even");
        if(ob.isOdd())
          System.out.println("No is odd");
        if(ob.isZero())
          System.out.println("No is zero");
        if(ob.isPositive())
          System.out.println("No is positive");
        if(ob.isNegative())
          System.out.println("No is negative");
        
    }
}