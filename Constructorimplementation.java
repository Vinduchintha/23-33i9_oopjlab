class Constructorimplementation {
    String name;
    int age;
    String designation;

    // Constructor
     Constructorimplementation(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
    }
}

public class main {
    public static void main(String[] args) {
        // Create an object using the constructor
           Constructorimplementation obj= new Constructorimplementation("padma", 30, "Software Engineer");

        // Call the method
        obj.displayDetails();
    }
}

OUT PUT:
Name: padma
Age: 30
Designation: Software Engineer
