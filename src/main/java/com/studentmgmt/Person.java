package com.studentmgmt;

/**
 * ==============================================================================
 * ABSTRACT CLASS: Person
 * ==============================================================================
 * 
 * OOP CONCEPT DEMONSTRATED: ABSTRACTION
 * 
 * WHAT IS AN ABSTRACT CLASS?
 * - An abstract class is a class that CANNOT be instantiated directly
 * - It serves as a TEMPLATE or BLUEPRINT for other classes
 * - It can contain both abstract methods (no body) and concrete methods (with body)
 * - Child classes MUST implement all abstract methods
 * 
 * WHY USE ABSTRACT CLASSES?
 * - To define common behavior that all child classes share
 * - To enforce that certain methods MUST be implemented by child classes
 * - To achieve abstraction (hiding implementation details)
 * 
 * IN THIS PROJECT:
 * - Person is abstract because we never create a plain "Person" object
 * - We only create specific types of people: Student, Teacher, etc.
 * - All people share common attributes (name, age, id) but have different behaviors
 * 
 * ==============================================================================
 */
public abstract class Person {
    
    /*
     * ENCAPSULATION DEMONSTRATION:
     * These variables are marked as 'private' to hide internal data
     * They can only be accessed through public getter/setter methods
     * This protects the data from unauthorized or incorrect modifications
     */
    private String name;
    private int age;
    private String id;
    
    /**
     * DEFAULT CONSTRUCTOR
     * A constructor with no parameters
     *
     */
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.id = "";

    }
    
    /**
     * PARAMETERIZED CONSTRUCTOR
     * A constructor that accepts parameters to initialize the object
     * 
     * DEMONSTRATES: Use of 'this' keyword
     * 
     * THE 'this' KEYWORD:
     * - 'this' refers to the CURRENT object
     * - Used to differentiate between instance variables and parameters with the same name
     * - Example: this.name = name; (left side is instance variable, right side is parameter)
     * 
     * @param name The person's name
     * @param age The person's age
     * @param id The person's unique identification number
     *
     */
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;

    }
    
    /**
     * ABSTRACT METHOD: displayInfo()
     * 
     * WHAT IS AN ABSTRACT METHOD?
     * - A method declared with the 'abstract' keyword
     * - It has NO body (no implementation)
     * - Child classes MUST override and provide implementation
     * 
     * WHY USE ABSTRACT METHODS?
     * - To force child classes to implement specific behavior
     * - Different types of Person (Student, Teacher) will display info differently
     * - This ensures every Person subclass has a displayInfo() method
     *
     * Do NOT implement this method here
     * It will be implemented in Student.java and Teacher.java
     */
    public abstract void displayInfo();
    
    /**
     * ABSTRACT METHOD: getRole()
     * Returns the role/type of the person (Student, Teacher, etc.)
     *
     * This will be implemented differently in each child class
     */
    public abstract String getRole();
    
    /*
     * ==============================================================================
     * GETTER AND SETTER METHODS
     * ==============================================================================
     * 
     * ENCAPSULATION PRINCIPLE:
     * - Private variables cannot be accessed directly from outside the class
     * - We provide PUBLIC getter and setter methods to access and modify them
     * - This gives us CONTROL over how data is accessed and modified
     * 
     * NAMING CONVENTION:
     * - Getter: get + VariableName (e.g., getName())
     * - Setter: set + VariableName (e.g., setName())
     * 
     * WHY USE GETTERS/SETTERS?
     * - Validation: We can validate data before setting (e.g., age cannot be negative)
     * - Read-only variables: Provide getter but no setter
     * - Calculated values: Getter can return computed values
     * ==============================================================================
     */
    
    /**
     * GET the person's name
     * 
     * @return The name of the person
     *
     */
    public String getName() {
        return name;

    }
    
    /**
     * SET the person's name
     * 
     * DEMONSTRATES: Use of 'this' keyword in setter
     * 
     * @param name The new name to set
     * 
     * TODO FOR STUDENTS:
     * Use 'this.name = name;' to set the instance variable
     * OPTIONAL: Add validation - name should not be null or empty
     */
    public void setName(String name) {
        // OPTIONAL: Add validation
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name!");
           return;
         }
        this.name = name;
    }
    
    /**
     * GET the person's age
     * 
     * @return The age of the person
     *
     */
    public int getAge() {
        return age;
    }
    
    /**
     * SET the person's age
     * 
     * @param age The new age to set
     *
     */
    public void setAge(int age) {

        // OPTIONAL: Add validation
         if (age < 1 || age > 150) {
            System.out.println("Invalid age!");
           return;
         }
        this.age = age;
    }
    
    /**
     * GET the person's ID
     * 
     * @return The unique ID of the person
     *
     */
    public String getId() {
        return id;
    }
    
    /**
     * SET the person's ID
     * 
     * @param id The new ID to set
     *
     */
    public void setId(String id) {
        this.id = id;

    }
    
    /**
     * CONCRETE METHOD (has implementation in abstract class)
     * 
     * This method has a body and can be used by all child classes
     * Child classes can use this method as-is OR override it
     * 
     * @return A basic description of the person
     *
     */
    public String getBasicInfo() {
        return "Person: " + this.name + ", ID: " + this.id;

    }
}
