// 2B: Write a java program for method overloading

class B {
    static void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    static void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    static void add(String a, String b) {
        System.out.println("Concatenation of strings: " + a + b);
    }

    public static void main(String[] args) {
        add(5, 3);
        add(4.2, 6.8);
        add("Hello ", "World");
    }
}
