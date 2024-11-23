import java.util.Scanner;

class OperatorPrecedenceDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter values for a, b, and c separated by spaces: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = (a + b) * c;
        int result3 = a + b / c;
        int result4 = (a + b) / c;

        System.out.println("Result of a + b * c: " + result1);
        System.out.println("Result of (a + b) * c: " + result2);
        System.out.println("Result of a + b / c: " + result3);
        System.out.println("Result of (a + b) / c: " + result4);

        sc.close();
    }
}
