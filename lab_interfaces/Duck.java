public class Duck implements IAnimal
{
    private String m_name;

    public Duck(String name)
    {
        m_name = name;
    }

    public String makeSound()
    {
        String s = m_name + " says: quack quack quack!";
        return s;
    }
}