import java.util.Scanner;

class SelectionStatementsDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        switch (number % 2) {
            case 0:
                System.out.println("The number is even.");
                break;
            case 1:
            case -1:
                System.out.println("The number is odd.");
                break;
            default:
                System.out.println("Unexpected value.");
        }

        sc.close();
    }
}
