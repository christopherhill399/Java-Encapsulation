/*
Name: Christopher Hill
Date: 9/15/2021
 */
package Hill.Chris;

import javax.swing.JOptionPane;

public class Driver 
{
    public static void main(String[] args)
    {
        Student student = new Student("005021", "Chris Hill", 'M', 4);
        Course course = new Course("BCIS 3680", "Enterprise Object Oriented Programming", "Dr. Wu", 3);
        Registration registration = new Registration(student, course, "Fall 2021");
        JOptionPane.showMessageDialog(null, registration.toString());
    }
}
 