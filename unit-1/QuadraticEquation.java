import java.util.Scanner;

class QuadraticEquation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coefficients a, b, and c separated by spaces: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double disc = b * b - 4 * a * c;

        System.out.println("\nThe quadratic equation is: " + a + "x^2 + " + b + "x + " + c + " = 0");

        if (disc > 0) {
            double root1 = (-b + Math.sqrt(disc)) / (2 * a);
            double root2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("The equation has two real and distinct solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (disc == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one real and repeated solution:");
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has no real solutions.");
        }

        sc.close();
    }
}
