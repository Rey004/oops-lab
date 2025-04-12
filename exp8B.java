// Create a generic class that can be used with any type of data

public class exp8B<T> {
    private T data;

    public exp8B(T data) {
        this.data = data;
    }

    public void displayData() {
        System.out.println("Data: " + data);
    } 

    public static void main(String[] args) {
        // Create instances of the generic class with different types of data
        exp8B<Integer> intObj = new exp8B<>(10);
        intObj.displayData(); // Integer

        exp8B<Double> doubleObj = new exp8B<>(3.14);
        doubleObj.displayData(); // Double

        exp8B<String> stringObj = new exp8B<>("Hello, World!");
        stringObj.displayData(); // String

        exp8B<Boolean> booleanObj = new exp8B<>(true);
        booleanObj.displayData(); // Boolean
    }
}