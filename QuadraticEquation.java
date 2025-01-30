import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate discriminant
        double D = (b * b) - (4 * a * c);

        System.out.println("Discriminant (D) = " + D);

        // Determine the nature of the roots and compute them
        if (D > 0) {
            System.out.println("The equation has two distinct real roots.");
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (D == 0) {
            System.out.println("The equation has one real root (repeated root).");
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has two complex roots.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}

OUT PUT:
Enter coefficient a: 2
Enter coefficient b: 4
Enter coefficient c: 6
Discriminant (D) = -32.0
The equation has two complex roots.
Root 1: -1.0 + 1.4142135623730951i
Root 2: -1.0 - 1.4142135623730951i