import java.util.*;

class Demo{

    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int prev1 = 0, prev2 = 1;
        int current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }
}

class Fibonacci{
	    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Demo fb = new Demo();
		
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int resultRecursive = fb.fibonacciRecursive(n);
        System.out.println("Fibonacci (Recursive): " + resultRecursive);

        int resultIterative = fb.fibonacciIterative(n);
        System.out.println("Fibonacci (Iterative): " + resultIterative);

        sc.close();
    }
}
