import java.util.Scanner;

class NarrowingConversionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;

        System.out.println("double to float: " + floatValue);
        System.out.println("float to long: " + longValue);
        System.out.println("long to int: " + intValue);
        System.out.println("int to short: " + shortValue);
        System.out.println("short to byte: " + byteValue);

        sc.close();
    }
}
