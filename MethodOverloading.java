class Methodoverloading{
    void displayDetails(String name) {
        System.out.println("Name: " + name);
    }

    void displayDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void displayDetails(String name, int age, String designation) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
    }
}

public class main {
    public static void main(String[] args) {
       Methodoverloading obj = new Methodoverloading();

        // Calling overloaded methods
        obj.displayDetails("padma");
        obj.displayDetails("padma", 30);
        obj.displayDetails("padma", 30, "Software Engineer");
    }
}

OUT PUT:
Name: padma
Name: padma
Age: 30
Name: padma
Age: 30
Designation: Software Engineer

