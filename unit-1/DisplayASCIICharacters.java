import java.util.Scanner;

class DisplayASCIICharacters{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range of ASCII values (start and end) separated by a space: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("ASCII characters in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            System.out.println(i + " -> " + (char) i);
        }
		
        sc.close();
    }
}
