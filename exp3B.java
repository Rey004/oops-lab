// 3B: Write a java program for calculator using the concept of inheritance

import java.util.Scanner;

class calculator{
    double a,b;
    calculator(double a,double b){
        this.a=a;
        this.b=b;
    }
    
    double add(){
        return a+b;
    }

    double sub(){
        return a-b;
    }
}

class Advanced_calculator extends calculator{
    Advanced_calculator(double a,double b){
        super(a,b);
    }

    double mul(){
        return a*b;
    }

    double div(){
        return a/b;
    }
}

class square_calculator extends Advanced_calculator{
    square_calculator(double a,double b){
        super(a,b);
    }

    double squareOfA(){
        return a*a;
    }

    double squarerootOfA(){
        return Math.sqrt(a);
    }

    double squareOfB(){
        return b*b;
    }

    double squarerootOfB(){
        return Math.sqrt(b);
    }
}

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculator\n");
        System.out.println("Enter First Number: ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double b = sc.nextDouble();

        square_calculator obj = new square_calculator(a, b);

        System.out.println("\nResults:");
        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.sub());
        System.out.println("Multiplication: " + obj.mul());
        
        if (b != 0) {
            System.out.println("Division: " + obj.div());
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }

        System.out.println("Square of A: " + obj.squareOfA());
        System.out.println("Square of B: " + obj.squareOfB());
        System.out.println("Square root of A: " + obj.squarerootOfA());
        System.out.println("Square root of B: " + obj.squarerootOfB());

        sc.close();
    }
}
