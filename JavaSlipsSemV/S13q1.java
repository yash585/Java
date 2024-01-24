/*Write a program to accept a file name from command prompt, if the file exits then display
number of words and lines in that file. */

import java.io.*;

class Count
{
    public static void main(String arg[]) throws Exception
    {
        FileReader f1=new FileReader("/home/yash/java/abc.txt");
        BufferedReader b1=new BufferedReader(f1);
        int w=0,l=0;
        String s;
        while((s=b1.readLine())!=null)
        {
            l++;
            String ar[]=s.split(" ");
            w=w+ar.length;
            
        }
        System.out.println("Word count::"+w+"\nLine:"+l);
    }
}