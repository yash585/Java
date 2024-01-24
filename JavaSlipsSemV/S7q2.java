/*Write a program to accept a text file from user and display the contents of a file in
reverse order and change its case. */

import java.io.*;

class file
{
    public static void main(String[] args) throws Exception
    {
        FileReader f1=new FileReader("/home/yash/java/abc.txt");
        BufferedReader b1=new BufferedReader(f1);
        String s;
        StringBuffer s1=new StringBuffer();
        while((s=b1.readLine())!=null)
        {
            s=s.toUpperCase();
            s1.append(s+"\n");
        }
        s1.reverse();
        System.out.println(s1);
    }
}
