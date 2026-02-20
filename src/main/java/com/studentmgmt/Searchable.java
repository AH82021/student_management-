package com.studentmgmt;

/**
 * ==============================================================================
 * INTERFACE: Searchable
 * ==============================================================================
 * 
 * WHAT IS AN INTERFACE?
 * - A completely abstract type (like a contract)
 * - Contains ONLY abstract methods (until Java 8)
 * - A class can IMPLEMENT multiple interfaces (unlike extending classes)
 * - All methods are public and abstract by default
 * - All variables are public, static, and final by default
 * 
 * INTERFACE vs ABSTRACT CLASS:
 * 
 * Abstract Class:
 * - Can have both abstract and concrete methods
 * - Can have instance variables
 * - A class can extend only ONE abstract class
 * - Use when classes share code and state
 * 
 * Interface:
 * - Only abstract methods (in basic Java)
 * - No instance variables (only constants)
 * - A class can implement MULTIPLE interfaces
 * - Use to define capabilities/behaviors that unrelated classes share
 * 
 * REAL-WORLD ANALOGY:
 * - Interface = A contract or agreement
 * - Example: "Searchable" means "can be searched"
 * - Any class implementing Searchable MUST provide search functionality
 * - Different classes can implement search differently
 * 
 * IN THIS PROJECT:
 * - Searchable defines that a class can search for items
 * - StudentManager will implement this interface
 * - This means StudentManager MUST implement searchById() and searchByName()
 * 
 * ==============================================================================
 */
public interface Searchable {

    /**
     * Search for an item by ID
     * 
     * INTERFACE METHOD RULES:
     * - No method body (just declaration)
     * - Automatically public and abstract
     * - Implementing class MUST provide implementation
     * 
     * @param id The ID to search for
     * @return A description or result of the search
     *
     */
    String searchById(String id);

    /**
     * Search for items by name
     *
     * @param name The name to search for
     * @return A description or result of the search
     *
     */
    String searchByName(String name);

    /*
     * LEARNING NOTE:
     * When StudentManager "implements Searchable", it MUST provide
     * implementations for BOTH searchById() and searchByName().
     * 
     * If StudentManager doesn't implement these methods, you will get
     * a compilation error!
     * 
     * This is how interfaces enforce a contract.
     */
}
