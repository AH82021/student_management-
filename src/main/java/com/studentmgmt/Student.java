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
     * TODO FOR STUDENTS:
     * 1. Call super() to initialize Person fields
     * 2. Initialize grade to 0.0 and major to "Undeclared"
     */
    public Student() {
        // TODO: Call parent constructor
        // super();
        // TODO: Initialize student-specific fields
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
     * TODO FOR STUDENTS:
     * 1. Use super(name, age, id) to initialize Person attributes
     * 2. Use 'this' keyword to initialize Student attributes
     */
    public Student(String name, int age, String id, double grade, String major) {
        // TODO: Call Person constructor with super keyword
        // super(name, age, id);
        // TODO: Initialize student-specific fields with 'this' keyword
        // this.grade = grade;
        // this.major = major;
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
     * TODO FOR STUDENTS:
     * Print student information in a formatted way:
     * - Student ID: [id]
     * - Name: [name]
     * - Age: [age]
     * - Major: [major]
     * - Grade: [grade]
     * 
     * HINT: Use getName(), getAge(), getId() inherited from Person
     */
    @Override
    public void displayInfo() {
        // TODO: Print student information
        // System.out.println("===== STUDENT INFORMATION =====");
        // System.out.println("Student ID: " + getId());
        // System.out.println("Name: " + getName());
        // etc...
    }
    
    /**
     * METHOD OVERRIDING: getRole()
     * 
     * 
     * Return the string "Student"
     */
    @Override
    public String getRole() {
        // TODO: return "Student";
        return null;
    }
    
    /*
     * ==============================================================================
     * GETTERS AND SETTERS FOR STUDENT-SPECIFIC ATTRIBUTES
     * ==============================================================================
     */
    
    /**
     * GET student's grade
     * 
     * TODO FOR STUDENTS:
     * Return the grade
     */
    public double getGrade() {
        // TODO: return grade;
        return 0.0;
    }
    
    /**
     * SET student's grade
     * 
     * @param grade The grade to set
     * 
     * TODO FOR STUDENTS:
     * Set the grade using 'this' keyword
     * OPTIONAL: Validate that grade is between 0.0 and 4.0
     */
    public void setGrade(double grade) {
        // TODO: this.grade = grade;
        // OPTIONAL: Validate grade range
    }
    
    /**
     * GET student's major
     * 
     * TODO FOR STUDENTS:
     * Return the major
     */
    public String getMajor() {
        // TODO: return major;
        return null;
    }
    
    /**
     * SET student's major
     * 
     * @param major The major to set
     * 
     * TODO FOR STUDENTS:
     * Set the major using 'this' keyword
     */
    public void setMajor(String major) {
        // TODO: this.major = major;
    }
    
    /**
     * STUDENT-SPECIFIC METHOD
     * 
     * This method is unique to Student (not in Person)
     * Demonstrates that child classes can have their own methods
     * 
     * @return true if student is in good standing (grade >= 2.0)
     * 
     * TODO FOR STUDENTS:
     * Return true if grade is >= 2.0, false otherwise
     */
    public boolean isInGoodStanding() {
        // TODO: return this.grade >= 2.0;
        return false;
    }
    
    /**
     * STUDENT-SPECIFIC METHOD
     * 
     * DEMONSTRATES: String class usage and formatting
     * 
     * @return A formatted string summary of the student
     * 
     * TODO FOR STUDENTS:
     * Return a string like: "Student: [name] (ID: [id]) - Major: [major], GPA: [grade]"
     * 
     * STRING CLASS METHODS YOU CAN USE:
     * - String.format() - for formatted output
     * - + operator - for string concatenation
     * - toUpperCase() - convert to uppercase
     * - toLowerCase() - convert to lowercase
     */
    public String getSummary() {
        // TODO: Return formatted student summary
        // Example: return String.format("Student: %s (ID: %s) - Major: %s, GPA: %.2f", 
        //              getName(), getId(), major, grade);
        return null;
    }
}
