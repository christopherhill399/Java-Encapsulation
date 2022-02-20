/* Demo for: Classes
   Student.java
   This class defines a simple template for student objects 
   
   To test it, create and structure proper folders for the 
   bcis3680.demo.students package and save this class to it.
   Alternatively, you may create you own package for testing
   and modify the package statement below to fit it.   
*/
   
package Hill.Chris;

public class Student
{
    //***** Static Variable *****//
    static int studentCount;

    //***** Instance Variables *****//
    private String untId;
    private String name;
    private char gender;
    private float gpa;

    // ***** Constructor *****//
    // It doesn't make much sense to accept the default initial
    // values for these instance variables because each student
    // would have the name "null", ID "null" and is of the ' '
    // gender. Therefore, a non-default constructor method is
    // created below, instead of using the default constructor
    // that Java runs implicitly for classes without an explicitly
    // created constructor method.
    public Student(String i, String n, char g, float gpa)
    {
		// Initializes instance variables of the new object 
        untId = i;
        name = n;
        gender = g;
        this.gpa = gpa;
		
		// Add 1 to the static variable for object count
		studentCount++;
    }

    // Like regular methods, a constructor method can be overloaded.
    // If warranted by software specs, we can create multiple version of the
    // constructor method. Below, we create a version that emulates the
    // "default" or implicit constructor that Java will run if no construtor
    // method is defined. Note that a default constructor automatically
	// created by Java won't increment the static variable.
	// As an aside, if a constructor is created, Java will
    // assume that we want to be control and will not run the "default"
    // constructor any more.
    public Student()
    {
		// No instance variable are initialized.
		// However, we still add 1 to the static varible for object count
		// because this contructor still does create an object, albeit an
		// "empty" one.
		studentCount++;
    }

    // Another version of the constructor. This version only initializes the ID
    // and name. A realistic business scenario may be that some demographic data
    // of the customers are optional. So it may be that the only mandatory fields
    // of input are ID and name. In this case, we only initialize ID and name.
    public Student(String i, String n)
    {
		// Initializes only two of the four instance variables.
        untId = i;
        name = n;
		
		// Add 1 to the static variable for object count
		studentCount++;
    }

    // ***** Setters and Getters *****//

    // For UNT ID //
    public void setUNTID(String id)
    {
        untId = id;
    }

    public String getUNTID()
    {
        return untId;
    }

    // For Name //
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    // For Gender //
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public char getGender()
    {
        return gender;
    }

    // For Age //
    public void setGPA(float gpa)
    {
        this.gpa = gpa;
    }

    public float getGPA()
    {
        return gpa;
    }

    // ***** Static Methods *****//
	// This is for illustration only. Since the object count is incremented in
	// in the contructors, there are rare, if at any, cases this would be really
	// needed to run.
    static void addToCount()
    {
        studentCount++;
    }

    static int readStudentCount()
    {
        return studentCount;
    }

    // ***** Instance Method *****//
    public void describeSelf()
    {
        String msg = "================================\n";
        msg += "Generated in Student Class\n";
        msg += untId + "\t" + name + "\t" + gpa + "\n";
        msg += "================================";

        System.out.println(msg);
    }
}
