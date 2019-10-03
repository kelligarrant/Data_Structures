import java.util.Scanner;


public class Recursion_Strings
{
    public static void main(String[] args)
    {
        System.out.println(""+foo("hello world",'l'));


    }
    public static String foo(String a, char b)
    {
        String ret ="";
        
        for(int i =0; i < a.length();i++)
        {
            if(a.charAt(i) != b)
            {
                ret = ret + a.charAt(i);
            }
        }
        return ret;
    }
} 