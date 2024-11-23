import java.util.Scanner;

class WhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number to count down from: ");
        int num = sc.nextInt();

        while (num > 0) {
            System.out.println(num);
            num--;
        }

        System.out.println("Countdown complete.");
        sc.close();
    }
}
