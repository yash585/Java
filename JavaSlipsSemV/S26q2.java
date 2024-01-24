/*Define a class ‘Donor’ to store the below mentioned details of a blood donor. name, age,
address, contactnumber, bloodgroup, date of last donation. Create ‘n’ objects of this class for
all the regular donors at Pune. Write these objects to a file. Read these objects from the file and
display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the
recent six months. */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Donor
{
    int age;
    String name,addr,contno,bgrp,date;

    Donor()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name age addr contact no blood grp date of las donation:");
        name=sc.next();
        age=sc.nextInt();
        addr=sc.next();
        contno=sc.next();
        bgrp=sc.next();
        date=sc.next();
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Limit:");
        int n=sc.nextInt();
        Donor ob[]=new Donor[n];
        for(int i=0;i<n;i++)
            ob[i]=new Donor();

        FileWriter fw=new FileWriter("/home/yash/Desktop/JavaSlipsSemV/donor.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        for(int i=0;i<n;i++)
        {
            bw.write(ob[i].name+"\t");
            bw.write(ob[i].age+"\t");
            bw.write(ob[i].addr+"\t");
            bw.write(ob[i].contno+"\t");
            bw.write(ob[i].bgrp+"\t");
            bw.write(ob[i].date+"\n");
        }

        bw.close();

        FileReader fr=new FileReader("/home/yash/Desktop/JavaSlipsSemV/donor.txt");
        BufferedReader br=new BufferedReader(fr);
        String s1;
        while((s1=br.readLine())!=null)
        {
            String s2[]=s1.split("\t");
            String s3[]=s2[5].split("-");
            int d=Integer.parseInt(s3[1]);
            if(s2[4].equals("A+") && (11-d)>=7)
            {

                System.out.println(s1+"\n");
            }
        }

        
    }
}