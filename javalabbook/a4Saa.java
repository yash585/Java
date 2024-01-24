import java.util.Scanner;

class Covid extends Exception
{
    public String toString()
    {
        return "Patient is covid positive need to be hospitalize";
    }
}

class Patient
{
    String patient_name;
    int patient_age,patient_oxy_level;
    double hrct_report;
    Patient()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter patient name, age, oxy level,hrct:");
        patient_name=sc.next();
        patient_age=sc.nextInt();
        patient_oxy_level=sc.nextInt();
        hrct_report=sc.nextDouble();
    }

}
class Hospital
{
    public static void main(String arg[])
    {
        Patient ob=new Patient();
        try
        {
            if(ob.patient_oxy_level<95||ob.hrct_report>10)
                throw new Covid();
            
            System.out.println(ob.patient_name+"\t"+ob.patient_age+"\t"+ob.patient_oxy_level+"\t"+ob.hrct_report);
        }
        catch(Covid c)
        {
            System.out.println(c);
        }

    }
}