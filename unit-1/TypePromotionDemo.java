class TypePromotionDemo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        double result = num + 5.5;
        System.out.println("Result after type promotion: " + result);
    }
}
