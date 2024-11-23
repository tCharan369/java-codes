import java.util.Scanner;

class OperatorsDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter another number: ");
        int anotherNum = sc.nextInt();

        int result = num;
        System.out.println("result = num: " + result);
        System.out.println("result += anotherNum: " + (result += anotherNum));
        System.out.println("result -= anotherNum: " + (result -= anotherNum));
        System.out.println("result *= anotherNum: " + (result *= anotherNum));
        System.out.println("result /= anotherNum: " + (result /= anotherNum));
        System.out.println("result %= anotherNum: " + (result %= anotherNum));
        System.out.println((num > anotherNum) ? "num is greater" : "anotherNum is greater or equal");

        sc.close();
    }
}
