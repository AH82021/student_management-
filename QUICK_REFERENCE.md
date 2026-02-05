# Quick Reference Guide - Java Basics

## 🔑 Essential Syntax Patterns

### **Creating Objects**
```java
// Pattern: ClassName objectName = new ClassName(arguments);
Student student1 = new Student();
Student student2 = new Student("Alice", 20, "S001", 3.8, "CS");
```

### **Using this Keyword**
```java
public void setName(String name) {
    this.name = name;  // this.name = instance variable
                       // name = parameter
}
```

### **Using super Keyword**
```java
public Student(String name, int age, String id) {
    super(name, age, id);  // Call parent constructor
    // Must be first statement!
}
```

### **Method Overriding**
```java
@Override  // Annotation (recommended)
public void displayInfo() {
    // Your implementation
}
```

---

## 📝 Scanner Patterns

### **Basic Setup**
```java
Scanner scanner = new Scanner(System.in);
// ... use scanner ...
scanner.close();  // Always close!
```

### **Reading Different Types**
```java
// String (entire line)
System.out.print("Enter name: ");
String name = scanner.nextLine();

// Integer
System.out.print("Enter age: ");
int age = scanner.nextInt();
scanner.nextLine();  // ← IMPORTANT! Consume newline

// Double
System.out.print("Enter GPA: ");
double gpa = scanner.nextDouble();
scanner.nextLine();  // ← IMPORTANT! Consume newline
```

### **The Newline Problem**
```java
// ❌ WRONG - Will skip name input!
int age = scanner.nextInt();
String name = scanner.nextLine();  // Gets empty string!

// ✅ CORRECT
int age = scanner.nextInt();
scanner.nextLine();  // Consume the leftover newline
String name = scanner.nextLine();  // Now works correctly
```

---

## 🔤 String Operations

### **Comparison**
```java
// ✅ CORRECT - Compares content
if (str1.equals(str2)) { }
if (str1.equalsIgnoreCase(str2)) { }  // Ignore case

// ❌ WRONG - Compares references!
if (str1 == str2) { }  // Don't use this!
```

### **Common Methods**
```java
String text = "  Hello World  ";

text.length()              // 16 (includes spaces)
text.trim()                // "Hello World"
text.toUpperCase()         // "  HELLO WORLD  "
text.toLowerCase()         // "  hello world  "
text.contains("World")     // true
text.substring(2, 7)       // "Hello"
text.replace("Hello", "Hi") // "  Hi World  "
text.isEmpty()             // false
text.trim().isEmpty()      // false
```

### **String Formatting**
```java
// Method 1: Concatenation
String msg = "Name: " + name + ", Age: " + age;

// Method 2: String.format() - More flexible!
String msg = String.format("Name: %s, Age: %d", name, age);
// %s = string, %d = integer, %f = float

// Examples:
String.format("GPA: %.2f", 3.8)      // "GPA: 3.80"
String.format("ID: %s", "S001")      // "ID: S001"
String.format("Age: %d", 20)         // "Age: 20"
```

---

## 📊 Array Operations

### **Declaration and Initialization**
```java
// Method 1: Declare then create
Student[] students;
students = new Student[100];

// Method 2: Combined
Student[] students = new Student[100];

// Method 3: With initial values
int[] numbers = {1, 2, 3, 4, 5};
```

### **Accessing Elements**
```java
// Set value at index
students[0] = new Student("Alice", 20, "S001", 3.8, "CS");
students[1] = new Student("Bob", 21, "S002", 3.5, "Math");

// Get value at index
Student firstStudent = students[0];
String name = students[0].getName();

// Array length
int capacity = students.length;  // Note: length is a property, not a method!
```

### **Looping Through Arrays**
```java
// Method 1: Traditional for loop (when you need index)
for (int i = 0; i < currentSize; i++) {
    System.out.println("Student " + i + ": " + students[i].getName());
}

// Method 2: Enhanced for loop (when you don't need index)
for (Student student : students) {
    if (student != null) {  // Check for null!
        student.displayInfo();
    }
}
```

### **Common Array Patterns**
```java
// Pattern 1: Adding to array
public boolean add(Student student) {
    if (currentSize < students.length) {
        students[currentSize] = student;
        currentSize++;
        return true;
    }
    return false;  // Array full
}

// Pattern 2: Searching array
public Student findById(String id) {
    for (int i = 0; i < currentSize; i++) {
        if (students[i].getId().equals(id)) {
            return students[i];  // Found!
        }
    }
    return null;  // Not found
}
```

---

## 🎨 Common Patterns

### **Constructor Pattern**
```java
// Default constructor
public Student() {
    this.name = "Unknown";
    this.age = 0;
    this.grade = 0.0;
}

// Parameterized constructor  
public Student(String name, int age, String id, double grade, String major) {
    this.name = name;
    this.age = age;
    this.id = id;
    this.grade = grade;
    this.major = major;
}
```

### **Getter/Setter Pattern**
```java
// Getter
public String getName() {
    return this.name;  // 'this' is optional here
}

// Setter (simple)
public void setName(String name) {
    this.name = name;  // 'this' is required here!
}

// Setter (with validation)
public void setAge(int age) {
    if (age > 0 && age < 150) {
        this.age = age;
    } else {
        System.out.println("Invalid age!");
    }
}
```

### **Menu Pattern**
```java
boolean running = true;
while (running) {
    displayMenu();
    int choice = scanner.nextInt();
    scanner.nextLine();  // Consume newline
    
    switch (choice) {
        case 1:
            // Do something
            break;
        case 2:
            // Do something else
            break;
        case 3:
            running = false;  // Exit
            break;
        default:
            System.out.println("Invalid choice!");
    }
}
```

---

## ⚠️ Common Mistakes to Avoid

### **1. Forgetting scanner.nextLine() after numbers**
```java
// ❌ WRONG
int age = scanner.nextInt();
String name = scanner.nextLine();  // Gets empty string!

// ✅ CORRECT
int age = scanner.nextInt();
scanner.nextLine();
String name = scanner.nextLine();
```

### **2. Using == for String comparison**
```java
// ❌ WRONG
if (name == "Alice") { }

// ✅ CORRECT
if (name.equals("Alice")) { }
```

### **3. ArrayIndexOutOfBoundsException**
```java
// ❌ WRONG
Student[] students = new Student[10];
students[10] = new Student();  // Index 10 doesn't exist!

// ✅ CORRECT
students[9] = new Student();  // Last index is length - 1
```

### **4. NullPointerException with Arrays**
```java
// ❌ WRONG
Student[] students = new Student[10];
System.out.println(students[0].getName());  // students[0] is null!

// ✅ CORRECT
if (students[0] != null) {
    System.out.println(students[0].getName());
}
```

### **5. Forgetting to use 'this' in setters**
```java
// ❌ WRONG - Assigns parameter to itself!
public void setName(String name) {
    name = name;  // Does nothing!
}

// ✅ CORRECT
public void setName(String name) {
    this.name = name;  // Assigns to instance variable
}
```

### **6. Forgetting super() must be first**
```java
// ❌ WRONG
public Student(String name) {
    this.grade = 0.0;
    super(name);  // ERROR! super() must be first!
}

// ✅ CORRECT
public Student(String name) {
    super(name);  // Must be first!
    this.grade = 0.0;
}
```

---

## 🎯 Quick Tips

### **Debugging**
```java
// Temporary debug prints
System.out.println("DEBUG: currentSize = " + currentSize);
System.out.println("DEBUG: Reached this point");
```

### **Formatting Output**
```java
// Nice separators
System.out.println("=".repeat(50));
System.out.println("---");
System.out.println();  // Blank line
```

### **Testing**
```java
// Create test data quickly
public void addTestData() {
    addStudent(new Student("Alice", 20, "S001", 3.8, "CS"));
    addStudent(new Student("Bob", 21, "S002", 3.5, "Math"));
    addStudent(new Student("Charlie", 19, "S003", 3.9, "Physics"));
}
```

---

## 📚 Documentation Format

### **JavaDoc Comments** (Optional for beginners)
```java
/**
 * Adds a student to the management system.
 * 
 * @param student The student to add
 * @return true if added successfully, false if system is full
 */
public boolean addStudent(Student student) {
    // Implementation
}
```

---

## 🚀 Practice Exercises

As you implement, try these challenges:

1. **Validation Challenge**
   - Add age validation (must be 1-150)
   - Add grade validation (must be 0.0-4.0)
   - Add ID format validation

2. **Feature Challenge**
   - Add a method to find the student with highest GPA
   - Add a method to count students by major
   - Add a method to display students in sorted order

3. **Error Handling Challenge**
   - Handle invalid Scanner input gracefully
   - Check for duplicate student IDs
   - Handle searching in empty system

---

**Keep this guide open while coding! 📖**
