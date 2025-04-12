package Experiment_7;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(100);
        obj1.display();

        String[] strArray = {"Hello", "World"};
        Integer[] intArray = {1, 2, 3, 4};

        printArray(strArray);
        printArray(intArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class GenericClass<T> {
    T value;

    GenericClass(T val) {
        value = val;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}
