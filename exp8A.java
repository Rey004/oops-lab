//create a generic method that can be used with any type of data

public class exp8A {
    public <T> void genericMethod(T data) {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        exp8A obj = new exp8A();
        // Call the generic method with different types of data
        obj.<Integer>genericMethod(10); // Integer
        obj.genericMethod(3.14); // Double
        obj.genericMethod("Hello, World!"); // String
        obj.genericMethod(true); // Boolean
    }
}