/*

Name: Christopher Hill
Date: 9/15/2021

*/
package Hill.Chris;


public class Course {
    
    private String courseNum;
    private String courseTitle;
    private String instructor;
    private int hours;
    
public Course(String cNum, String cTitle, String instruct, int h)
{
    courseNum = cNum;
    courseTitle = cTitle;
    instructor = instruct;
    hours = h;
}

    
public void setCourseTitle(String courseTitle) 
{
    this.courseTitle = courseTitle;   
}

public void setInstructor(String instructor) 
{
    this.instructor = instructor;
}



public String getCourseTitle() 
{
    return this.courseTitle;
}

public String getInstructor() 
    
{
    return this.instructor;
}

}
