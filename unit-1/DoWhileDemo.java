import java.util.Scanner;

class DoWhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number to count down from: ");
        int num = sc.nextInt();

        do {
            System.out.println(num);
            num--;
        } while (num > 0);

        System.out.println("Countdown complete.");
        sc.close();
    }
}
