package com.studentmgmt;

import java.util.Scanner;

/**
 * ==============================================================================
 * MAIN CLASS: StudentManagementSystem
 * ==============================================================================
 * 
 * CONCEPTS DEMONSTRATED:
 * 1. SCANNER CLASS - Reading user input from console
 * 2. MENU-DRIVEN PROGRAM - Using loops and switch statements
 * 3. STRING CLASS - String operations and comparisons
 * 4. PUTTING IT ALL TOGETHER - Using all OOP concepts in one application
 * 
 * WHAT IS THE SCANNER CLASS?
 * - Scanner is a class in java.util package used to read input
 * - Can read from keyboard, files, strings, etc.
 * - Common methods:
 * - nextLine() - reads a full line of text
 * - next() - reads a single word
 * - nextInt() - reads an integer
 * - nextDouble() - reads a decimal number
 * 
 * THIS IS THE ENTRY POINT OF YOUR APPLICATION:
 * - Contains the main() method
 * - Java applications start executing from main()
 * - Syntax: public static void main(String[] args)
 * 
 * ==============================================================================
 */
public class StudentManagementSystem {

    /**
     * MAIN METHOD
     * The starting point of every Java application
     * 
     * SIGNATURE BREAKDOWN:
     * - public: Can be called from anywhere
     * - static: Belongs to the class, not an instance (no object needed)
     * - void: Doesn't return anything
     * - main: Special name recognized by JVM
     * - String[] args: Command-line arguments (array of strings)
     * 
     * TODO FOR STUDENTS:
     * Implement the complete menu-driven application following the structure below
     */
    public static void main(String[] args) {

        /*
         * =============================================================================
         * =
         * STEP 1: SCANNER SETUP
         * =============================================================================
         * =
         * 
         * TODO FOR STUDENTS:
         * 1. Create a Scanner object to read from System.in (keyboard)
         * 2. Create a StudentManager object to manage students
         * 
         * SYNTAX:
         * Scanner scanner = new Scanner(System.in);
         * 
         * IMPORTANT: Always close Scanner when done using scanner.close()
         */

        // TODO: Create Scanner object
        // Scanner scanner = new Scanner(System.in);

        // TODO: Create StudentManager object
        // StudentManager manager = new StudentManager();

        /*
         * =============================================================================
         * =
         * STEP 2: MENU-DRIVEN LOOP
         * =============================================================================
         * =
         * 
         * TODO FOR STUDENTS:
         * Create an infinite loop that displays a menu and processes user choices
         * 
         * MENU OPTIONS:
         * 1. Add New Student
         * 2. Display All Students
         * 3. Search Student by ID
         * 4. Search Student by Name
         * 5. Add Sample Data (for testing)
         * 6. Exit
         * 
         * LOOP STRUCTURE:
         * while (true) {
         * // Display menu
         * // Read choice
         * // Process choice
         * // Exit if user chooses exit option
         * }
         */

        // TODO: Implement menu loop
        // System.out.println("==============================================");
        // System.out.println(" STUDENT MANAGEMENT SYSTEM");
        // System.out.println("==============================================");
        //
        // boolean running = true;
        // while (running) {
        // displayMenu();
        // int choice = scanner.nextInt();
        // scanner.nextLine(); // Consume newline
        //
        // switch (choice) {
        // case 1:
        // addNewStudent(scanner, manager);
        // break;
        // case 2:
        // manager.displayAllStudents();
        // break;
        // case 3:
        // searchById(scanner, manager);
        // break;
        // case 4:
        // searchByName(scanner, manager);
        // break;
        // case 5:
        // addSampleData(manager);
        // break;
        // case 6:
        // running = false;
        // System.out.println("Thank you for using the system!");
        // break;
        // default:
        // System.out.println("Invalid choice. Please try again.");
        // }
        // }
        //
        // scanner.close();

        System.out.println("\n");
        System.out.println("==============================================");
        System.out.println("  TODO: IMPLEMENT THE MAIN METHOD");
        System.out.println("==============================================");
        System.out.println("Follow the instructions in the comments above");
        System.out.println("to create a menu-driven student management system.");
    }

    /**
     * Display the main menu
     * 
     * TODO FOR STUDENTS:
     * Print the menu options in a formatted way
     */
    private static void displayMenu() {
        // TODO: Print menu
        // System.out.println("\n==============================================");
        // System.out.println(" MAIN MENU");
        // System.out.println("==============================================");
        // System.out.println("1. Add New Student");
        // System.out.println("2. Display All Students");
        // System.out.println("3. Search Student by ID");
        // System.out.println("4. Search Student by Name");
        // System.out.println("5. Add Sample Data (for testing)");
        // System.out.println("6. Exit");
        // System.out.println("==============================================");
        // System.out.print("Enter your choice: ");
    }

    /**
     * Add a new student by getting input from user
     * 
     * DEMONSTRATES: Scanner class usage for different data types
     * 
     * @param scanner Scanner object to read input
     * @param manager StudentManager to add the student to
     * 
     *                TODO FOR STUDENTS:
     *                1. Prompt user for student details (name, age, id, grade,
     *                major)
     *                2. Read each input using appropriate Scanner method
     *                3. Create a new Student object with the input
     *                4. Add the student using manager.addStudent()
     *                5. Print success or error message
     * 
     *                SCANNER METHODS:
     *                - scanner.nextLine() for String
     *                - scanner.nextInt() for int
     *                - scanner.nextDouble() for double
     * 
     *                IMPORTANT: After reading a number, call scanner.nextLine() to
     *                consume the newline
     * 
     *                Example:
     *                System.out.print("Enter age: ");
     *                int age = scanner.nextInt();
     *                scanner.nextLine(); // Consume newline!
     */
    private static void addNewStudent(Scanner scanner, StudentManager manager) {
        // TODO: Implement student input and addition
        // System.out.println("\n--- Add New Student ---");
        //
        // System.out.print("Enter student name: ");
        // String name = scanner.nextLine();
        //
        // System.out.print("Enter age: ");
        // int age = scanner.nextInt();
        // scanner.nextLine(); // Consume newline
        //
        // System.out.print("Enter student ID: ");
        // String id = scanner.nextLine();
        //
        // System.out.print("Enter grade/GPA: ");
        // double grade = scanner.nextDouble();
        // scanner.nextLine(); // Consume newline
        //
        // System.out.print("Enter major: ");
        // String major = scanner.nextLine();
        //
        // Student student = new Student(name, age, id, grade, major);
        // if (manager.addStudent(student)) {
        // System.out.println("✓ Student added successfully!");
        // } else {
        // System.out.println("✗ Failed to add student (System full)");
        // }
    }

    /**
     * Search for a student by ID
     * 
     * DEMONSTRATES: String input and method calling
     * 
     * @param scanner Scanner to read input
     * @param manager StudentManager to search in
     * 
     *                TODO FOR STUDENTS:
     *                1. Prompt user for student ID
     *                2. Read the ID using scanner.nextLine()
     *                3. Call manager.searchById() and print the result
     */
    private static void searchById(Scanner scanner, StudentManager manager) {
        // TODO: Implement search by ID
        // System.out.print("\nEnter student ID to search: ");
        // String id = scanner.nextLine();
        // String result = manager.searchById(id);
        // System.out.println(result);
    }

    /**
     * Search for students by name
     * 
     * @param scanner Scanner to read input
     * @param manager StudentManager to search in
     * 
     *                TODO FOR STUDENTS:
     *                1. Prompt user for name to search
     *                2. Read the name using scanner.nextLine()
     *                3. Call manager.searchByName() and print the result
     */
    private static void searchByName(Scanner scanner, StudentManager manager) {
        // TODO: Implement search by name
    }

    /**
     * Add sample data for testing
     * 
     * DEMONSTRATES: Creating multiple objects
     * 
     * @param manager StudentManager to add sample data to
     * 
     *                TODO FOR STUDENTS:
     *                Create 3-4 sample students and add them to the manager
     *                This makes testing easier without manually entering data
     */
    private static void addSampleData(StudentManager manager) {
        // TODO: Create and add sample students
        // System.out.println("\n--- Adding Sample Data ---");
        //
        // Student s1 = new Student("Alice Johnson", 20, "S001", 3.8, "Computer
        // Science");
        // Student s2 = new Student("Bob Smith", 21, "S002", 3.5, "Mathematics");
        // Student s3 = new Student("Charlie Brown", 19, "S003", 3.9, "Physics");
        //
        // manager.addStudent(s1);
        // manager.addStudent(s2);
        // manager.addStudent(s3);
        //
        // System.out.println("✓ Sample data added successfully!");
        // System.out.println(" Total students: " + manager.getStudentCount());
    }

    /**
     * POLYMORPHISM DEMONSTRATION (OPTIONAL ADVANCED EXERCISE)
     * 
     * Create a method that demonstrates polymorphism by:
     * 1. Creating an array of Person type
     * 2. Adding both Student and Teacher objects to it
     * 3. Looping through and calling displayInfo() on each
     * 4. Observing how each object behaves according to its actual type
     * 
     * This shows RUNTIME POLYMORPHISM - the actual method called depends
     * on the object's type at runtime, not the reference type
     */
    private static void demonstratePolymorphism() {
        // OPTIONAL TODO FOR ADVANCED STUDENTS:
        // Person[] persons = new Person[4];
        // persons[0] = new Student("Alice", 20, "S001", 3.8, "CS");
        // persons[1] = new Teacher("Dr. Smith", 45, "T001", "Mathematics", 15);
        // persons[2] = new Student("Bob", 21, "S002", 3.5, "Physics");
        // persons[3] = new Teacher("Prof. Johnson", 50, "T002", "Chemistry", 20);
        //
        // System.out.println("\n===== POLYMORPHISM DEMO =====");
        // System.out.println("Calling displayInfo() on Person array:");
        // System.out.println("Notice how Students and Teachers display
        // differently!\n");
        //
        // for (Person person : persons) {
        // person.displayInfo(); // Calls Student or Teacher version based on actual
        // object
        // System.out.println("Role: " + person.getRole());
        // System.out.println("--------------------");
        // }
    }

    /*
     * =============================================================================
     * =
     * SCANNER CLASS - IMPORTANT NOTES
     * =============================================================================
     * =
     * 
     * Common Scanner Methods:
     * - next() : Reads next token (word)
     * - nextLine() : Reads entire line
     * - nextInt() : Reads integer
     * - nextDouble() : Reads decimal number
     * - nextBoolean() : Reads boolean
     * - hasNext() : Checks if there's more input
     * - hasNextInt() : Checks if next input is an integer
     * 
     * IMPORTANT GOTCHA - The Newline Problem:
     * 
     * When you call nextInt(), nextDouble(), etc., they read the number but
     * leave the newline character (\n) in the buffer.
     * 
     * If you then call nextLine(), it will read that leftover newline,
     * giving you an empty string!
     * 
     * SOLUTION: Add scanner.nextLine() after reading numbers
     * 
     * Example:
     * System.out.print("Enter age: ");
     * int age = scanner.nextInt();
     * scanner.nextLine(); // ← IMPORTANT! Consume the newline
     * 
     * System.out.print("Enter name: ");
     * String name = scanner.nextLine(); // Now this works correctly
     * 
     * =============================================================================
     * =
     * STRING CLASS - IMPORTANT METHODS
     * =============================================================================
     * =
     * 
     * Common String Methods:
     * - length() : Get string length
     * - charAt(index) : Get character at position
     * - equals(other) : Compare strings (ALWAYS use this, not ==)
     * - equalsIgnoreCase(other) : Compare ignoring case
     * - contains(substring) : Check if contains substring
     * - substring(start, end) : Extract portion of string
     * - toUpperCase() : Convert to uppercase
     * - toLowerCase() : Convert to lowercase
     * - trim() : Remove leading/trailing whitespace
     * - split(delimiter) : Split string into array
     * - isEmpty() : Check if string is empty
     * - replace(old, new) : Replace characters/substrings
     * 
     * STRING COMPARISON:
     * ✓ CORRECT: str1.equals(str2)
     * ✗ WRONG: str1 == str2 (compares references, not content!)
     * 
     * =============================================================================
     * =
     */
}
