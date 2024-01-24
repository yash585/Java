/*Write a menu driven program to perform the following operations on multidimensional array
ie matrices :
 Addition
 Multiplication
 Exit */

import java.util.Scanner;

class Matrix
{
    Scanner sc=new Scanner(System.in);
    int r,c,m1[][],m2[][];
    Matrix()
    {
        System.out.println("enter limit for row and column");
        r=sc.nextInt();
        c=sc.nextInt();
        m1=new int[r][c];
        m2=new int[r][c];
        System.out.println("enter 1st matrix::");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("["+i+j+"]=");
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter 2nd matrix::");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("["+i+j+"]=");
                m2[i][j]=sc.nextInt();
            }
        }

    }

    void disp(int mn[][])
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(mn[i][j]+"\t");
            }
            System.out.println();
        }
    }

    int[][] add()
    {
        int mn[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mn[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return mn;
    }

    int[][] multiplication()
    {
        int mn[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<c;k++)
                {
                    mn[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        return mn;        
    }

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        Matrix m=new Matrix();
        int m1[][]=new int[m.r][m.c];
        int ch;
        do
        {
            System.out.println("1.Addition\n2.Multiplication\n3.Exit\nENTER CHOICE...:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: m1=m.add();
                        m.disp(m1);
                        break;

                case 2: m1=m.multiplication();
                        m.disp(m1);
                        break;

                case 3: System.exit(0);

            }
        }while(ch<4);
    }
}