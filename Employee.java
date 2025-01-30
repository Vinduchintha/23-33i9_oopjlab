class Employee {
    // Class properties
    String name;
    int age;
    String designation;

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee emp = new Employee();

        // Assign values to the properties
        emp.name = "Padma";
        emp.age = 30;
        emp.designation = "Software Engineer";

        // Call the method
        emp.displayDetails();
    }
}

OUT PUT:
Name: Padma
Age: 30
Designation: Software Engineer
