import java.util.Scanner;


public class Recursion_Strings
{
    public static void main(String[] args)
    {
        System.out.println(""+c(4,3));


    }
    public static String foo(String a, char b)//part 3
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

    public static int c(int n, int k)//part 4
    {
        if((n == 0) ||(k==0)||(n==k) )
        {
            return 1;
        }
        else
        {
            return c(n-1,k)+c(n-1,k-1);
        }
    }
} 