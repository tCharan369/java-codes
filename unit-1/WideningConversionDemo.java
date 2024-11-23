import java.util.Scanner;

class WideningConversionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("byte to short: " + shortValue);
        System.out.println("short to int: " + intValue);
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        sc.close();
    }
}
