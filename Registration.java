/*
Name: Christopher Hill
Date: 9/15/2021
*/
package Hill.Chris;


public class Registration 
{
    private Student student = new Student();
    private Course course = new Course("3680", "BCIS 3680", "Dr. Wu", 3);
    private String semester;
    
    
    public Registration(Student stud, Course cour, String semester)
    {
        this.student = stud;
        this.course = cour;
        this.semester = semester;
        
    }
    
    public String toString()
    {
        return student.getName() + " is registered in '" + course.getCourseTitle() +
                "' taught by " + course.getInstructor() + " in " + semester; 
    }
}


  