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
     * TODO FOR STUDENTS:
     * Initialize name to "Unknown", age to 0, and id to empty string
     */
    public Person() {
        // TODO: Initialize default values here
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
     * TODO FOR STUDENTS:
     * Set the instance variables using the 'this' keyword
     */
    public Person(String name, int age, String id) {
        // TODO: Use 'this' keyword to assign parameters to instance variables
        // Example: this.name = name;
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
     * TODO FOR STUDENTS:
     * Do NOT implement this method here
     * It will be implemented in Student.java and Teacher.java
     */
    public abstract void displayInfo();
    
    /**
     * ABSTRACT METHOD: getRole()
     * Returns the role/type of the person (Student, Teacher, etc.)
     * 
     * TODO FOR STUDENTS:
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
     * TODO FOR STUDENTS:
     * Return the name variable
     */
    public String getName() {
        // TODO: return name;
        return null;
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
        // TODO: this.name = name;
        // OPTIONAL: Add validation
        // if (name == null || name.trim().isEmpty()) {
        //     System.out.println("Invalid name!");
        //     return;
        // }
    }
    
    /**
     * GET the person's age
     * 
     * @return The age of the person
     * 
     * TODO FOR STUDENTS:
     * Return the age variable
     */
    public int getAge() {
        // TODO: return age;
        return 0;
    }
    
    /**
     * SET the person's age
     * 
     * @param age The new age to set
     * 
     * TODO FOR STUDENTS:
     * Set the age using 'this' keyword
     * OPTIONAL: Add validation - age should be between 1 and 150
     */
    public void setAge(int age) {
        // TODO: this.age = age;
        // OPTIONAL: Add validation
        // if (age < 1 || age > 150) {
        //     System.out.println("Invalid age!");
        //     return;
        // }
    }
    
    /**
     * GET the person's ID
     * 
     * @return The unique ID of the person
     * 
     * TODO FOR STUDENTS:
     * Return the id variable
     */
    public String getId() {
        // TODO: return id;
        return null;
    }
    
    /**
     * SET the person's ID
     * 
     * @param id The new ID to set
     * 
     * TODO FOR STUDENTS:
     * Set the id using 'this' keyword
     */
    public void setId(String id) {
        // TODO: this.id = id;
    }
    
    /**
     * CONCRETE METHOD (has implementation in abstract class)
     * 
     * This method has a body and can be used by all child classes
     * Child classes can use this method as-is OR override it
     * 
     * @return A basic description of the person
     * 
     * TODO FOR STUDENTS:
     * Return a string like: "Person: [name], ID: [id]"
     * HINT: Use string concatenation or String.format()
     */
    public String getBasicInfo() {
        // TODO: Return formatted string with name and id
        // Example: return "Person: " + this.name + ", ID: " + this.id;
        return null;
    }
}
