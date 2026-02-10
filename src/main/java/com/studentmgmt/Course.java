package com.studentmgmt;

/**
 * ==============================================================================
 * CLASS: Course
 * ==============================================================================
 * 
 * OOP CONCEPT DEMONSTRATED: ENCAPSULATION
 * 
 * WHAT IS ENCAPSULATION?
 * - Bundling data (variables) and methods that operate on that data into a
 * single unit (class)
 * - Hiding internal state and requiring all interaction through methods
 * - Using private variables and public getters/setters
 * 
 * WHY ENCAPSULATION?
 * - Data protection: Prevent unauthorized access or modification
 * - Validation: Control how data is set (e.g., capacity can't be negative)
 * - Flexibility: Change internal implementation without affecting other code
 * - Maintenance: Easier to update and debug
 * 
 * THIS CLASS ALSO DEMONSTRATES:
 * - String class usage
 * - 'this' keyword
 * - Constructors
 * 
 * ==============================================================================
 */
public class Course {


    private String courseCode; // Example: "CS101"
    private String courseName; // Example: "Introduction to Programming"
    private int capacity; // Maximum number of students
    private int enrolledCount; // Current number of enrolled students

    /**
     * DEFAULT CONSTRUCTOR
     * 
     * TODO FOR STUDENTS:
     * Initialize with default values:
     * - courseCode: "UNASSIGNED"
     * - courseName: "No Name"
     * - capacity: 30
     * - enrolledCount: 0
     */
    public Course() {
        courseCode = "UNASSIGNED";
        courseName = "No Name";
        capacity = 30;
        enrolledCount = 0;
    }

    /**
     * PARAMETERIZED CONSTRUCTOR
     * 
     * @param courseCode The course code
     * @param courseName The course name
     * @param capacity   Maximum student capacity
     *
     */
    public Course(String courseCode, String courseName, int capacity) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.capacity = capacity;
        enrolledCount = 0;
    }


     // GETTERS AND SETTERS (ENCAPSULATION IN ACTION)


    public String getCourseCode() {

        return courseCode;
    }

    /**
     * SET course code
     * 
     * DEMONSTRATES: String class methods
     * 
     * @param courseCode The course code to set
     * 
     *                   TODO FOR STUDENTS:
     *                   Before setting, convert courseCode to UPPERCASE using
     *                   toUpperCase()
     *                   This ensures all course codes are stored consistently
     * 
     *                   STRING METHOD: toUpperCase()
     *                   - Converts all characters in a string to uppercase
     *                   - Example: "cs101".toUpperCase() returns "CS101"
     *                   - Original string is NOT modified (strings are immutable)
     *                   - Returns a NEW string
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode.toUpperCase();
    }

    public String getCourseName() {
        return courseName ;
    }

    /**
     * SET course name
     * 
     * DEMONSTRATES: String validation
     * 
     * @param courseName The course name to set
     * 
     *                   TODO FOR STUDENTS:
     *                   Add validation: only set if courseName is not null and not
     *                   empty
     * 
     *                   STRING METHODS USED:
     *                   - trim() - removes leading and trailing whitespace
     *                   - isEmpty() - checks if string is empty
     */
    public void setCourseName(String courseName) {

        if ( courseName != null && !courseName.trim().isEmpty() ){
            this.courseName = courseName;
        }
    }


    public int getCapacity() {
        return this.capacity;
    }

    /**
     * SET capacity
     * 
     * DEMONSTRATES: Data validation in setters
     * 
     * @param capacity The maximum capacity
     * 
     *                 TODO FOR STUDENTS:
     *                 Only set capacity if it's greater than 0
     *                 Print an error message if invalid
     */

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Capacity must be positive!");
        }
    }

    }






    public int getEnrolledCount() {
        return this.enrolledCount;
    }

    /**
     * Check if course is full
     * 
     * @return true if enrolled count equals capacity
     *
     */


    public boolean isFull() {
        if( enrolledCount >= capacity){
        return true;
        } else { return false;}

    }

    /**
     * Enroll a student in the course
     * 
     * DEMONSTRATES: Business logic with encapsulation
     * 
     * @return true if enrollment successful, false if course is full
     * 
     *         TODO FOR STUDENTS:
     *         1. Check if course is full using isFull()
     *         2. If full, print message and return false
     *         3. If not full, increment enrolledCount and return true
     */

    // TODO: Implement enrollment logic
    public boolean enrollStudent() {
      if(isFull()==true){
          System.out.println("Course is full right now, Thank you!");
          return false;
      } else {
          return true;
    }

    /**
     * Get available seats
     * 
     * @return Number of seats still available
     * 
     *         TODO FOR STUDENTS:
     *         Return capacity minus enrolledCount
     */


    public int getAvailableSeats() {
        return capacity - enrolledCount;
    }

    /**
     * Get course information as a formatted string
     * 
     * DEMONSTRATES: String class methods and formatting
     * 
     * @return Formatted course information
     * 
     *         TODO FOR STUDENTS:
     *         Return a formatted string with course details
     * 
     *         STRING METHODS YOU CAN USE:
     *         - String.format() - for formatted output with placeholders
     *         - + operator - for concatenation
     *         - StringBuilder - for efficient string building (advanced)
     * 
     *         Example output:
     *         "[CS101] Introduction to Programming - Enrolled: 25/30"
     */
    public String getCourseInfo() {

        return "[" + courseCode + "] " + courseName +
                " - Enrolled: " + enrolledCount + "/" + capacity;
    }

       }



}
