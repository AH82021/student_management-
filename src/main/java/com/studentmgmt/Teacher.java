package com.studentmgmt;

/**
 * ==============================================================================
 * CLASS: Teacher
 * ==============================================================================
 * 
 * OOP CONCEPTS DEMONSTRATED:
 * 1. INHERITANCE - Teacher extends Person (just like Student)
 * 2. POLYMORPHISM - Different implementation of displayInfo() than Student
 * 3. ENCAPSULATION - Private variables with controlled access
 * 
 * POLYMORPHISM DEMONSTRATION:
 * - Both Student and Teacher extend Person
 * - Both override displayInfo() differently
 * - A Person reference can point to Student OR Teacher (runtime polymorphism)
 * - Example: Person p = new Student(); OR Person p = new Teacher();
 * 
 * ==============================================================================
 */
public class Teacher extends Person {

    /*
     * TEACHER-SPECIFIC ATTRIBUTES
     */
    private String subject; // Subject the teacher teaches
    private int yearsOfExperience; // Teaching experience in years

    /**
     * DEFAULT CONSTRUCTOR
     * 
     * TODO FOR STUDENTS:
     * 1. Call super() to initialize Person fields
     * 2. Initialize subject to "General" and yearsOfExperience to 0
     */
    public Teacher() {
        // TODO: Call parent constructor
        // TODO: Initialize teacher-specific fields
    }

    /**
     * PARAMETERIZED CONSTRUCTOR
     * 
     * @param name              Teacher's name
     * @param age               Teacher's age
     * @param id                Teacher's ID
     * @param subject           Subject taught
     * @param yearsOfExperience Years of teaching experience
     * 
     *                          TODO FOR STUDENTS:
     *                          Use super() and 'this' keyword to initialize all
     *                          fields
     */
    public Teacher(String name, int age, String id, String subject, int yearsOfExperience) {
        // TODO: Initialize using super and this
    }

    /**
     * METHOD OVERRIDING: displayInfo()
     * 
     * POLYMORPHISM IN ACTION:
     * - This method has the SAME name as Student.displayInfo()
     * - But it has DIFFERENT implementation
     * - At runtime, the correct version is called based on object type
     * 
     * TODO FOR STUDENTS:
     * Display teacher information:
     * - Teacher ID: [id]
     * - Name: [name]
     * - Age: [age]
     * - Subject: [subject]
     * - Experience: [yearsOfExperience] years
     */
    @Override
    public void displayInfo() {
        // TODO: Print teacher information
        // System.out.println("===== TEACHER INFORMATION =====");
        // System.out.println("Teacher ID: " + getId());
        // etc...
    }

    /**
     * METHOD OVERRIDING: getRole()
     * 
     * TODO FOR STUDENTS:
     * Return the string "Teacher"
     * 
     * NOTICE: Same method name as in Student, but different return value
     * This is POLYMORPHISM!
     */
    @Override
    public String getRole() {
        // TODO: return "Teacher";
        return null;
    }

    /*
     * =============================================================================
     * =
     * GETTERS AND SETTERS
     * =============================================================================
     * =
     */

    public String getSubject() {
        // TODO: return subject;
        return null;
    }

    public void setSubject(String subject) {
        // TODO: this.subject = subject;
    }

    public int getYearsOfExperience() {
        // TODO: return yearsOfExperience;
        return 0;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        // TODO: this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * TEACHER-SPECIFIC METHOD
     * 
     * @return true if teacher is senior (10+ years experience)
     * 
     *         TODO FOR STUDENTS:
     *         Return true if yearsOfExperience >= 10
     */
    public boolean isSeniorTeacher() {
        // TODO: return this.yearsOfExperience >= 10;
        return false;
    }
}
