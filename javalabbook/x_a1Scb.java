import java.util.*;

class array
{
    Scanner sc=new Scanner(System.in);
    int sum=0;
    void accept(int m,int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
             System.out.println("enter element at"+i+"and"+j);
             m[i][j]=sc.nextInt()
            }
        }
    }
    void disp(int m,int r,int c)
    {
        for(i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            System.out.print(m[i][j]);
        }
        System.out.println();
    }
    void diagonal()
    {}
    void Upper()
    {}
    void Lower()
    {}
    
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        array a=new array();
        System.out.println("Enter rows nd columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m[][]=new m[r][c];
        a.accept(m, r, c);
        a.disp(m, r, c);
        
        System.out.println("\n1.Diagonal\n2.Upper\n3.Lower");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: a.diagonal(m,r,c);
                    break;
            case 2: a.Upper(m,r,c);
                    break;
            case 3: a.Lower(m[i][j]);
                    break;

        }

    }
}
