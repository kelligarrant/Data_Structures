class Rectangle
{
    private int m_width;
    private int m_height;
    public static void main(String arg[])
    {
        Rectangle r= new Rectangle(3,4);
        System.out.println(r.getHeight()); 
        System.out.println(r.getWidth());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
    public Rectangle()
    {
        m_height=1;
        m_width=1;
    }
    public Rectangle(int a, int b)
    {
        m_height=a;
        m_width=b;
    }
    public int getWidth()
    {
        return m_width;
    }
    public int getHeight()
    {
        return m_height;
    }
    public int getArea()
    {
        return m_width*m_height;
    }
    public int getPerimeter()
    {
        return m_height +m_height+m_width+m_width;
    }
}