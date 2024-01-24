/*Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order. */

import java.util.Scanner;

class CricketPlayer
{
    String name;
    int innings,notout,tot_runs;
    double bat_avg;
    Scanner sc=new Scanner(System.in);

    CricketPlayer()
    {
        System.out.println("enter name innings notout totruns");
        name=sc.next();
        innings=sc.nextInt();
        notout=sc.nextInt();
        tot_runs=sc.nextInt();
        bat_avg=CricketPlayer.avg(tot_runs,innings,notout);
    }

    void disp()
    {
        System.out.println(name+"\t"+innings+"\t"+notout+"\t"+tot_runs+"\t"+bat_avg);
    }
    static double avg(int tot_runs,int innings,int notout)
    {
        return tot_runs/(innings-notout);
    }
    static void sort(CricketPlayer c[],int n)
    {
        CricketPlayer temp;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(c[i].bat_avg>c[j].bat_avg)
                {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
    }

    public static void main(String ar[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit for players:");
        int n=sc.nextInt();
        CricketPlayer ob[]=new CricketPlayer[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new CricketPlayer();
        }
        System.out.println("\nName\tInnings\tNotOuts\tTotRuns\tBat_avg");        
        for(int i=0;i<n;i++)
        {
            ob[i].disp();
        }
        sort(ob, n);
        System.out.println("\n\nAfter sorting on bat avg:");
        System.out.println("\nName\tInnings\tNotOuts\tTotRuns\tBat_avg");
        for(int i=0;i<n;i++)
        {
            ob[i].disp();
        }
    }
    
}