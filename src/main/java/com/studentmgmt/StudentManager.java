package com.studentmgmt;

/**
 * ==============================================================================
 * CLASS: StudentManager
 * ==============================================================================
 * 
 * CONCEPTS DEMONSTRATED:
 * 1. ARRAYS - Storing multiple Student objects
 * 2. INTERFACE IMPLEMENTATION - Implements Searchable
 * 3. POLYMORPHISM - Stores Student objects in a Person array
 * 
 * WHAT THIS CLASS DOES:
 * - Manages a collection of students using an array
 * - Provides methods to add, search, and display students
 * - Implements the Searchable interface
 * 
 * ARRAYS IN JAVA:
 * - Fixed-size collection of elements of the same type
 * - Zero-indexed (first element is at index 0)
 * - Syntax: Type[] arrayName = new Type[size];
 * - Example: Student[] students = new Student[50];
 * 
 * ==============================================================================
 */
public class StudentManager implements Searchable {

    /*
     * ARRAY DEMONSTRATION
     * 
     * This array stores Student objects
     * - students[0] = first student
     * - students[1] = second student
     * - etc.
     * 
     * We also need to track how many students are actually stored (currentSize)
     * because the array might not be full
     */
    private Student[] students; // Array to store students
    private int currentSize; // Number of students currently stored
    private final int MAX_STUDENTS = 100; // Maximum capacity (constant)

    /**
     * CONSTRUCTOR
     * 
     * DEMONSTRATES: Array initialization
     *
     */
    public StudentManager() {
        // TODO: Initialize array and currentSize
        students = new Student[MAX_STUDENTS];
        currentSize = 0;

    }

    /**
     * Add a student to the array
     * 
     * DEMONSTRATES: Working with arrays
     * 
     * @param student The student to add
     * @return true if added successfully, false if array is full
     *
     */
    public boolean addStudent(Student student) {
        // TODO: Implement add logic
        if (currentSize < MAX_STUDENTS) {
            students[currentSize] = student;
            currentSize++;
            return true;

        } else {
            System.out.println("Cannot add more student");

            return false;
        }
    }
    /**
     * INTERFACE METHOD IMPLEMENTATION: searchById()
     * 
     * DEMONSTRATES:
     * - Implementing interface methods
     * - Looping through arrays
     * - String comparison
     * 
     * @param id The student ID to search for
     * @return Student information if found, or "Not found" message
     *
     */
    @Override
    public String searchById(String id) {
        for (int i = 0; i < currentSize; i++) {
            Student student = students[i];
            if (student.getId().equals(id)) {
                return student.getSummary();
            }
        }
        return "Student not found";
    }

    /**
     * INTERFACE METHOD IMPLEMENTATION: searchByName()
     * 
     * @param name The name to search for
     * @return Information about all matching students
     *
     */
    @Override
    public String searchByName(String name) {
        String result = null;
        for (int i = 0; i < MAX_STUDENTS; i++) {
            Student student = students[i];

            if (student.getName().equals(name)) {
                result = student.getId();

            }
        }

        if (result == null) {
            return null;
        }
        return result;
    }

    /**
     * Display all students
     * 
     * DEMONSTRATES: Enhanced for loop with arrays
     * 
     * TODO FOR STUDENTS:
     * Loop through all students and call displayInfo() on each
     * 
     * TWO WAYS TO LOOP THROUGH ARRAYS:
     * 
     * 1. Traditional for loop:
     * for (int i = 0; i < currentSize; i++) {
     * students[i].displayInfo();
     * }
     * 
     * 2. Enhanced for loop (cleaner but can't use index):
     * for (int i = 0; i < currentSize; i++) {
     * Student student = students[i];
     * student.displayInfo();
     * }
     * 
     * Note: We loop to currentSize, NOT students.length
     * because students.length is MAX_STUDENTS but we may not have filled the array
     */
    public void displayAllStudents() {
        // TODO: Loop and display all students
        // System.out.println("\n===== ALL STUDENTS =====");
        // for (int i = 0; i < currentSize; i++) {
        // students[i].displayInfo();
        // System.out.println("--------------------");
        // }
    }

    /**
     * Get the number of students currently stored
     * 
     * TODO FOR STUDENTS:
     * Return currentSize
     */
    public int getStudentCount() {
        // TODO: return currentSize;
        return 0;
    }

    /**
     * POLYMORPHISM DEMONSTRATION:
     * Store both Students and Teachers in a Person array
     * 
     * This method shows that:
     * - A Person array can hold Student objects (Student IS-A Person)
     * - A Person array can hold Teacher objects (Teacher IS-A Person)
     * - We can call Person methods on any object in the array
     * 
     * @param persons Array of Person objects (could be Students, Teachers, or mix)
     * 
     *                TODO FOR STUDENTS:
     *                Loop through the persons array and call displayInfo() on each
     *                Notice how each object displays differently based on its
     *                actual type!
     *                This is RUNTIME POLYMORPHISM
     * 
     *                The persons array could contain:
     *                persons[0] = new Student(...); // Displays as student
     *                persons[1] = new Teacher(...); // Displays as teacher
     *                persons[2] = new Student(...); // Displays as student
     */
    public void displayPersons(Person[] persons) {
        // TODO: Loop through and display all persons
        // Notice how displayInfo() behaves differently for Students vs Teachers!
    }

    /**
     * ARRAYS LEARNING NOTES:
     * 
     * Common Array Operations:
     * 1. Declaration: Type[] name;
     * 2. Initialization: name = new Type[size];
     * 3. Combined: Type[] name = new Type[size];
     * 4. Access element: name[index]
     * 5. Get length: name.length (property, not method)
     * 6. Set element: name[index] = value;
     * 
     * Common Mistakes:
     * - ArrayIndexOutOfBoundsException: Accessing name[10] when array size is 10
     * (Remember: arrays are 0-indexed, so last element is name[9])
     * - NullPointerException: Accessing an array element that's null
     * - Using == instead of .equals() for string comparison
     */
}
