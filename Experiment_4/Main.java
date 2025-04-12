package Experiment_4;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}

interface Shape {
    void area();
}

class Circle implements Shape {
    int radius = 5;

    public void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle implements Shape {
    int length = 10, breadth = 4;

    public void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}
