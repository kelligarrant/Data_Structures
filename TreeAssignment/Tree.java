import javax.lang.model.util.ElementScanner6;

public class Tree implements Comparable
{
    //Because we just talked about methods and classes and objects in C++
    //my brain kept reverting to that.
	private Tree m_left;
	private Tree m_right;
	private Tree m_parent;
	private char m_char;
	private int m_total;

	public Tree(Tree l, Tree r, char ch, int total)
	{
		m_left = l;
		m_right = r;
		m_char = ch;
		m_total = total;
	}

	public Tree getLeft()
	{ return m_left; }
	
	public Tree getRight()
	{ return m_right; }
	
	public Tree getParent()
	{ return m_parent; }
	
	public void setParent(Tree n)
	{ m_parent = n; }
	   
	public int getTotal()
	{ return m_total; }
	
	public char getChar()
	{ return m_char; }
	
	public void printTree()
	{
	   _printTree(this);
	}
	
	public void _printTree(Tree n)
	{
        System.out.println(m_char);
        _printTree(m_left);
        _printTree(m_right);
        
	}
	
	@Override
	public String toString()
	{
		return String.format("%s (%2d)", m_char, m_total);
	}
	
	@Override
	public int compareTo(Tree t2)
	{
        int ret = 0;
        if(m_total> t2.getTotal())
        {
            ret = 1;
        }
        else if(m_total<t2.getTotal())
        {
            ret = -1;
        }
        else
        {
            ret = m_char.compareTo(t2.getChar());
        }
	}
}