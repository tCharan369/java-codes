import java.util.Scanner;

class JumpStatementsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to iterate up to: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i == 5) {
                System.out.println("Skipping 5");
                continue;
            }
            if (i == 8) {
                System.out.println("Breaking at 8");
                break;
            }
            System.out.println("Number: " + i);
        }

        System.out.println("Returning early from the method.");
        return;
    }
}
