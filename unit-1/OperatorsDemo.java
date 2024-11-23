import java.util.Scanner;

class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        System.out.println("Bitwise Operators:");
        System.out.println("AND: " + (num1 & num2));
        System.out.println("OR: " + (num1 | num2));
        System.out.println("XOR: " + (num1 ^ num2));
        System.out.println("Left Shift (num1 << 1): " + (num1 << 1));
        System.out.println("Right Shift (num1 >> 1): " + (num1 >> 1));

        System.out.println("Relational Operators:");
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));

        sc.close();
    }
}
