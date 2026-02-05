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
     * TODO FOR STUDENTS:
     * 1. Initialize the students array with size MAX_STUDENTS
     * 2. Set currentSize to 0
     * 
     * ARRAY INITIALIZATION:
     * students = new Student[MAX_STUDENTS];
     */
    public StudentManager() {
        // TODO: Initialize array and currentSize
    }

    /**
     * Add a student to the array
     * 
     * DEMONSTRATES: Working with arrays
     * 
     * @param student The student to add
     * @return true if added successfully, false if array is full
     * 
     *         TODO FOR STUDENTS:
     *         1. Check if currentSize < MAX_STUDENTS (array not full)
     *         2. If not full:
     *         - Add student to students[currentSize]
     *         - Increment currentSize
     *         - Return true
     *         3. If full:
     *         - Print "Cannot add more students"
     *         - Return false
     * 
     *         ARRAY ACCESS:
     *         students[currentSize] = student; // Add to next available position
     */
    public boolean addStudent(Student student) {
        // TODO: Implement add logic
        return false;
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
     *         TODO FOR STUDENTS:
     *         1. Loop through the students array from index 0 to currentSize-1
     *         2. For each student, check if getId().equals(id)
     *         3. If found, return the student's information (use getSummary())
     *         4. If not found after loop, return "Student not found"
     * 
     *         ARRAY LOOP PATTERN:
     *         for (int i = 0; i < currentSize; i++) {
     *         Student student = students[i];
     *         // Check student
     *         }
     * 
     *         STRING COMPARISON:
     *         Use .equals() NOT ==
     *         - id.equals(searchId) ✓ Correct
     *         - id == searchId ✗ Wrong (compares references, not content)
     */
    @Override
    public String searchById(String id) {
        // TODO: Implement search by ID
        return null;
    }

    /**
     * INTERFACE METHOD IMPLEMENTATION: searchByName()
     * 
     * @param name The name to search for
     * @return Information about all matching students
     * 
     *         TODO FOR STUDENTS:
     *         1. Loop through students array
     *         2. Check if getName() contains the search name (case-insensitive)
     *         3. Collect all matching students
     *         4. Return their information or "No students found"
     * 
     *         STRING METHODS FOR SEARCHING:
     *         - contains() - check if string contains substring
     *         - equalsIgnoreCase() - compare ignoring case
     *         - toLowerCase() - convert to lowercase for comparison
     * 
     *         Example:
     *         if (student.getName().toLowerCase().contains(name.toLowerCase())) {
     *         // Match found!
     *         }
     */
    @Override
    public String searchByName(String name) {
        // TODO: Implement search by name
        return null;
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
