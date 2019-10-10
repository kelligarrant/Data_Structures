public class Stuff implements ITriplet
{
    private int first;
    private int second;
    private int third;

    public Stuff(int a, int b, int c)
    {
        first = a;
        second = b;
        third = c;
    }

    public int getFirst()
    {
        return first;
    }
    public int getSecond()
    {
        return second;
    }
    public int getThird()
    {
        return third;
    }
    public void sort()
    {
        int f = 0;
        int s = 0;
        int t= 0;
        
        if( (first <= second )&&(first <= third) )
        {
            f = first;
            if (second <= third)
            {
                s= second;
                t = third;
            }
            else
            {
                s = third;
                t = second;
            }
        }
        else if ( (second <= first )&&(second <= third) )
        {
            f= second;
            if (first <= third)
            {
                s= first;
                t = third;
            }
            else
            {
                s = third;
                t = first;
            }
        }
        else 
        {
            f= third;
            if (second <= first)
            {
                s= second;
                t = first;
            }
            else
            {
                s = first;
                t = second;
            }
        }
        first =f;
        second = s;
        third = t;
    }
    public void clear()
    {
        first = 0;
        second = 0;
        third = 0;

    }

}