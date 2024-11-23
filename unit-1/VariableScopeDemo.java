import java.util.Scanner;

class VariableScopeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            int square = num * num;
            System.out.println("Square inside if block: " + square);
        }

        for (int i = 1; i <= num; i++) {
            int cube = i * i * i;
            System.out.println("Cube of " + i + ": " + cube);
        }

        // System.out.println(square); // Uncommenting this will cause an error
        sc.close();
    }
}
