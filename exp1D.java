// Write a java program for maintaining records of employee

class Employee {
    int id;
    String name;
    int salary;

    void insert(int i, String n, int s){
        id = i;
        name = n;
        salary = s;
    }

    void display(){
        System.out.println("id: " + id + " name: " + name + " salary: " + salary);
    }
}

public class D {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.insert(1, "xyz", 10000);
        e2.insert(2, "abc", 20000);

        e1.display();
        e2.display();
    }
}