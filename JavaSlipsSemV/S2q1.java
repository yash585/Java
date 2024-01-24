/*Write a program to read the First Name and Last Name of a person, his weight and height using
command line arguments. Calculate the BMI Index which is defined as the individual's body mass
divided by the square of their height.
(Hint : BMI = Wts. In kgs / (ht)2) */
class BMI
{
    public static void main(String ar[])
    {
        String fn=ar[0];
        String ln=ar[1];
        double w=Double.parseDouble(ar[2]);
        double h=Double.parseDouble(ar[3]);
        double bmi=w/(h*h);
        System.out.println("\n\nBMI Index of "+fn+" "+ln+"::"+bmi);
    }
}