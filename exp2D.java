// 2D: Write a java program find volume of a box in integer as well as in decimal

class Volume {
    public void calculate(int height, int width, int length){
        System.out.println("Volume: " + height * width * length);
    }

    public void calculate(double heightD, double widthD, double lengthD){
        System.out.println("Volume: " + heightD * widthD * lengthD);
    }
}

public class D {

    public static void main(String[] args) {
        Volume cube1 = new Volume();
        Volume cube2 = new Volume();

        cube1.calculate(2, 3, 4);
        cube2.calculate(2.5, 3.5, 4.5);
    }
}
