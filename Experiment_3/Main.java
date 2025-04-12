package Experiment_3;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getDetails("Revanshu", 21);
        e.setSalary(50000);
        e.display();
    }
}

class Person {
    String name;
    int age;

    void getDetails(String n, int a) {
        name = n;
        age = a;
    }
}

class Employee extends Person {
    float salary;

    void setSalary(float s) {
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
