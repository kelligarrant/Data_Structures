import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        
        System.out.println("" + f(4));
    }

    public static int f(int n)
    {
        if (n==1 || n==0)
            return 1;
        else
        {
            return (f(n-1)+f(n-2));
        }
            
    }
}