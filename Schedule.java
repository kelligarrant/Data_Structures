import Course.java;
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
        m_cources[numCourses]= c;
        numCourses++;
    }
    public String toString()
    {
        String courseList= m_cources[0].toString();
        for(int i=1;1<numCourses;i++)
        {
            courseList = courseList + m_cources[i];
        }
        return courseList;
    }
}