import java.util.*;
class Cricket
{
    String name;
    int innings,notout,tot_runs;
    double bat_avg;
    //ASSINING VIA CONSTRUCTOR
    Cricket(String name1,int innings1,int notout1,int tot_runs1)
    {
        name=name1;
        innings=innings1;
        notout=notout1;
        tot_runs=tot_runs1;
    }
    //AVERAGE
    static double avg(int tot_runs,int innings,int notout)
    {
        double bat_avg=tot_runs/(innings-notout);
        return bat_avg;
    }
    //SORTING
    static void sort(Cricket cr[],int n)
    {
        Cricket temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(cr[i].bat_avg>cr[j].bat_avg)
                {
                    temp=cr[i];
                    cr[i]=cr[j];
                    cr[j]=temp;
                }
            }
        }
    }
    //DISPLAY
    void disp()
    {
        System.out.println(name+"\t"+innings+"\t"+notout+"\t"+tot_runs+"\t"+bat_avg);
    }
    //MAIN
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit for players::");
        int n=sc.nextInt();
        Cricket ob[]=new Cricket[n];
        System.out.println("Enter players info::");
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Name,innings,not out,total runs,batting avg::");
            String name=sc.next();
            int innings=sc.nextInt();
            int notout=sc.nextInt();
            int tot_runs=sc.nextInt();            
            ob[i]=new Cricket(name,innings,notout,tot_runs);
            ob[i].bat_avg=avg(tot_runs,innings,notout);
        }

        System.out.println("Name\tInnings\tNotouts\tTotal runs\tBatting avg");
        for(int i=0;i<n;i++)
            ob[i].disp();

        sort(ob, n);

        System.out.println("After sorting::\nName\tInnings\tNotouts\tTotal runs\tBatting avg");
        for(int i=0;i<n;i++)
            ob[i].disp();
    }
}