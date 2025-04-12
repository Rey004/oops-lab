// 3A: Write a java program for scanner, for printing name, integer and float

import java.util.Scanner; 

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        System.out.println("Enter a float: ");
        float f = sc.nextFloat();

        System.out.println("\nName: " + name);
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);

        sc.close();
    }
}