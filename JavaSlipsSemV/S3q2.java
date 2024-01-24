/*Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information. */

import java.util.Scanner;

class Positive extends Exception
{
    public String toString()
    {
        return "Patient is Covid +ve";
    }
}

class Patient
{
    Scanner sc=new Scanner(System.in);
    String p_name;
    int age,oxy_level,hrct;
    Patient()
    {
        System.out.println("enter pname, age, oxy_level, hrct");
        p_name=sc.next();
        age=sc.nextInt();
        oxy_level=sc.nextInt();
        hrct=sc.nextInt();
    }
}
class Hospital
{
    public static void main(String[] args) 
    {
        Patient p=new Patient();
        try
        {
            if(p.oxy_level<95||p.hrct>10)
            {
                throw new Positive();
            }
            System.out.println(p.p_name+"\t"+p.age+"\t"+p.oxy_level+"\t"+p.hrct);
        }
        catch(Positive e)
        {
            System.out.println(e);
        }
    }
}