class WrapperClassesDemo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        Integer wrappedInt = Integer.valueOf(num);

        System.out.println("Enter a double:");
        double dbl = sc.nextDouble();
        Double wrappedDouble = Double.valueOf(dbl);

        System.out.println("Enter a boolean:");
        boolean bool = sc.nextBoolean();
        Boolean wrappedBoolean = Boolean.valueOf(bool);

        System.out.println("Primitive integer: " + num);
        System.out.println("Wrapped integer: " + wrappedInt);
        System.out.println("Primitive double: " + dbl);
        System.out.println("Wrapped double: " + wrappedDouble);
        System.out.println("Primitive boolean: " + bool);
        System.out.println("Wrapped boolean: " + wrappedBoolean);
    }
}
