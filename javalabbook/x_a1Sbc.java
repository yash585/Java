import java.util.*;

class Matrix
{
//    int m1[][],m2[][];
    Scanner sc=new Scanner(System.in);
    void accept(int m1[][],int m2[][],int r,int c)
    {
        System.out.println("Enter first Matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter second Matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }

    }

    void disp(int m[][],int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
        }
    }

    int[][] add(int m1[][],int m2[][],int r,int c)
    {
        int m3[][]=new int[r][c];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return m3;
    }

    void multi(int m1[][],int m2[][],int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++);
        }
    }

    int[][] transpose(int m1[][],int r,int c)
    {
        int m[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                m[i][j]=m1[j][i];
        }
        return m;

    }

    public static void main(String arg[])
    {
        Matrix ob=new Matrix();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit of rows and columns::");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m1[][]=new int[r][c];
        int m2[][]=new int[r][c];
        int m3[][]=new int[r][c];
        int ch;
        ob.accept(m1,m2,r,c);
        do
        {
            System.out.println("enter choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Addition::");
                        m3=ob.add(m1, m2, r, c);
                        ob.disp(m3, r, c);
                        break;
                case 2:
                        break;
                case 3: System.out.println("Transpose::");
                        m3=ob.transpose(m1,r,c);
                        ob.disp(m3,r,c);
                        break;
            }
        }while(ch<4);

    }
}