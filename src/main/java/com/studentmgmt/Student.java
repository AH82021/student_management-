package com.studentmgmt;

/**
 * ==============================================================================
 * CLASS: Student
 * ==============================================================================
 * 
 * OOP CONCEPTS DEMONSTRATED:
 * 1. INHERITANCE - Student extends (inherits from) Person
 * 2. POLYMORPHISM - Overriding methods from parent class
 * 3. ENCAPSULATION - Private variables with getters/setters
 * 
 * WHAT IS INHERITANCE?
 * - Student "extends" Person, meaning Student IS-A Person
 * - Student inherits all non-private fields and methods from Person
 * - Student can access Person's public and protected methods
 * - Student adds its own specific attributes (grade, major)
 * 
 * BENEFITS OF INHERITANCE:
 * - Code reuse: Don't repeat name, age, id - already in Person
 * - Logical hierarchy: Models real-world relationships
 * - Polymorphism: Student can be treated as a Person
 * 
 * ==============================================================================
 */
public class Student extends Person {
    
    /*
     * STUDENT-SPECIFIC ATTRIBUTES
     * These are in ADDITION to inherited attributes (name, age, id)
     */
    private double grade;       // Student's current grade/GPA
    private String major;       // Student's field of study
    
    /**
     * DEFAULT CONSTRUCTOR
     * 
     * SUPER KEYWORD:
     * - 'super()' calls the parent class (Person) constructor
     * - Must be the FIRST statement in the constructor
     * - Initializes the inherited fields
     * 
     *
     */

    public Student() {
        super();
        this.grade = 0.0;
        this.major = "Undeclared";
    }
    
    /**
     * PARAMETERIZED CONSTRUCTOR
     * 
     * @param name Student's name (inherited from Person)
     * @param age Student's age (inherited from Person)
     * @param id Student's ID (inherited from Person)
     * @param grade Student's grade/GPA
     * @param major Student's major
     * 
     *
     */
    public Student(String name, int age, String id, double grade, String major) {
        super(name, age, id);
        this.grade = grade;
         this.major = major;
    }
    
    /**
     * METHOD OVERRIDING: displayInfo()
     * 
     * WHAT IS METHOD OVERRIDING?
     * - Providing a SPECIFIC implementation for an abstract method from parent
     * - The method signature (name, parameters, return type) must be EXACTLY the same
     * - Uses @Override annotation (optional but recommended)
     * 
     * WHY OVERRIDE?
     * - Student displays info differently than a generic Person
     * - This is POLYMORPHISM - same method name, different behavior
     * 
     * @Override annotation:
     * - Tells compiler you're intentionally overriding
     * - Compiler will error if method doesn't actually override anything
     * - Good practice: Always use @Override
     * 

     */
    @Override
    public void displayInfo() {
        System.out.println("===== STUDENT INFORMATION =====");
         System.out.println("Student ID: " + getId());
         System.out.println("Name: " + getName());
         System.out.println("age: " + getAge());
         System.out.println("Major: " + getMajor());
         System.out.println("Grade: " + getGrade());
    }
    
    /**
     * METHOD OVERRIDING: getRole()
     * 
     * 
     * Return the string "Student"
     */
    @Override
    public String getRole() {
        return "Student";
    }
    
    /*
     * ==============================================================================
     * GETTERS AND SETTERS FOR STUDENT-SPECIFIC ATTRIBUTES
     * ==============================================================================
     */
    
    /**
     * GET student's grade
     * 

     */
    public double getGrade() {
        return grade;
    }
    
    /**
     * SET student's grade
     * 
     * @param grade The grade to set
     * 
     *
     */
    public void setGrade(double grade) {
        if (grade < 0.0 || grade > 4.0) {
            System.out.println("Grade is Invalid");
            return;
        }
        this.grade = grade;
    }
    
    /**
     * GET student's major
     * 
     *
     */
    public String getMajor() {
        return major;
    }
    
    /**
     * SET student's major
     * 
     * @param major The major to set
     * 

     */
    public void setMajor(String major) {
          this.major = major;
    }
    
    /**
     * STUDENT-SPECIFIC METHOD
     * 
     * This method is unique to Student (not in Person)
     * Demonstrates that child classes can have their own methods
     * 
     * @return true if student is in good standing (grade >= 2.0)
     * 

     */
    public boolean isInGoodStanding() {
        if (this.grade >= 2.0){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * STUDENT-SPECIFIC METHOD
     * 
     * DEMONSTRATES: String class usage and formatting
     * 
     * @return A formatted string summary of the student
     * 

     * 
     * STRING CLASS METHODS YOU CAN USE:
     * - String.format() - for formatted output
     * - + operator - for string concatenation
     * - toUpperCase() - convert to uppercase
     * - toLowerCase() - convert to lowercase
     */
    public String getSummary() {
        return String . format( "Student: " + getName() + "ID: " + getId() + "Major: " + getMajor().toUpperCase() + "GPA: " + getGrade());

    }
}
