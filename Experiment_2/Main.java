package Experiment_2;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);

        System.out.println("Area of default rectangle: " + r1.area());
        System.out.println("Area of rectangle: " + r2.area());

        r1 = null;
        r2 = null;

        System.gc();  
    }
}

class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    protected void finalize() {
        System.out.println("Object is destroyed.");
    }

}
