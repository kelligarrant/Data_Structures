import java.util.ArrayList;
class Schedule
{
    private ArrayList<Course> m_cources;
    private int numCourses;

    public Schedule()
    {
        numCourses = 0;
    }
    public void addCource(Course c)
    {
        m_cources.add(c);
        numCourses++;
    }
    public String toString()
    {
        String courseList= "";
        for(int i=0;1<numCourses;i++)
        {
            courseList = courseList + m_cources.get(i).toString();
        }
        return courseList;
    }
}