public class MinStack<T extends Comparable<T>> implements IStack<T>
{
    private StackLL m_stack;
    private StackLL min_stack;
    
    @Override
    public void push(T n)
    {
        m_stack.push(n);
        if(min_stack.isEmpty())
        {
            min_stack.push(n);
        }
        else
        {
            T m = min_stack.pop();
            if(m.compareTo(n)<0)
            {
                min_stack.push(m);
            }
            else
            {
                min_stack.push(m);
                min_stack.push(n);
            }
        }
    }
    @Override
    public T pop();
    {
        if(isEmpty())
        {
            throw new IllegalStateException("pop error: Stack is empty");
        }
        T ret = m_stack.pop();
        T m = min_stack.pop();
        if(ret.compareTo(m) != 0)
        {
            min_stack.push(m);
        }
        return ret;
    }
    public T min()
    {
        T m = min_stack.pop();
        T ret = m;
        min_stack.push(m);
        return ret;
    }
    @Override
    public T top()
    {
        T ret = m_stack.top();
        return ret;
    
    }
    @Override
    public int getSize()
    {
        return m_stack.getSize();
    }
    @Override
    public boolean isEmpty()
    {
        return m_stack.isEmpty();
    }

    @Override
    public String toString()
    {
        return m_stack.toString();
    }

}