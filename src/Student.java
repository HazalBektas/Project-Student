public class Student {

    //COMPLETE THIS CLASS BEFORE MathStudent and ScienceStudent classes as they will be sub-classes of Student class

    public Student(String firstName, String lastName, int age, String gender, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }


    //HERE! Create a 5 args constructor


    /*
    HERE!
    Create private instance variables as below
    firstName
    lastName
    age
    gender
    className
    NOTE: only age will be int and others are String
     */
    public String firstName;
    public String lastName;
    public int age;
    public String gender;
    public String className;



    /*
    HERE!
    Provide public getter method for className only
     */

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
/*
        HERE!
        Override toString() method that returns Student object information
        It should be dynamic considering child classes that inherits
     */

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
