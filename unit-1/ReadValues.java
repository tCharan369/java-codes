import java.util.Scanner;

public class ReadValues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a long integer value: ");
        long longValue = sc.nextLong();

        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(0); 

        System.out.println("\nYou entered:");
        System.out.println("Float: " + floatValue);
        System.out.println("Long: " + longValue);
        System.out.println("Character: " + charValue);

        sc.close();
    }
}
