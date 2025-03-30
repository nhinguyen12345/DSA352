/* Person.java:  
 * This class provides a basic object to extend in future labs. 
 * Comments are omitted for accessor and mutator methods    
 * Author: John Cigas
 * Last updated: July 2021
 */

 public class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Override toString method to display Person info
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
