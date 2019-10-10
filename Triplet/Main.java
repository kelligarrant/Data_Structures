public class Main
{
    public static void main(String[] args)
    {
        (new Main()).go();
    }
    public void go()
    {
        ITriplet t = new Stuff(23, 4,9);
        if (t.getFirst() != 23)
        {
            throw new IllegalStateException("getFirst failed!!!!");

        }
        if (t.getSecond() != 4)
        {
            throw new IllegalStateException("getSecond failed!!!!");
            
        }
        if (t.getThird() != 9)
        {
            throw new IllegalStateException("getThird failed!!!!");
            
        }
        t.sort();
        if (t.getFirst() != 4)
        {
            throw new IllegalStateException("getFirst failed!!!! after sort");

        }
        if (t.getSecond() != 9)
        {
            throw new IllegalStateException("getSecond failed!!!! after sort");
            
        }
        if (t.getThird() != 23)
        {
            throw new IllegalStateException("getThird failed!!!! after sort");
            
        }
        t.clear();
        if (t.getFirst() != 0)
        {
            throw new IllegalStateException("getFirst failed!!!! after clear");

        }
        if (t.getSecond() != 0)
        {
            throw new IllegalStateException("getSecond failed!!!! after clear");
            
        }
        if (t.getThird() != 0)
        {
            throw new IllegalStateException("getThird failed!!!! after clear");
            
        }


    }

}