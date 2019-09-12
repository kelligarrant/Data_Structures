public class Pig implements IAnimal
{
    private String m_name;

    public Pig(String name)
    {
        m_name = name;
    }

    public String makeSound()
    {
        String s = m_name + " says: oink oink oink!";
        return s;
    }
}