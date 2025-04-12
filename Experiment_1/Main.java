class Student {
    String name;
    int rollNo;
    float marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Revanshu";
        s1.rollNo = 101;
        s1.marks = 88.5f;

        Student s2 = new Student();
        s2.name = "Aryan";
        s2.rollNo = 102;
        s2.marks = 91.0f;

        s1.display();
        s2.display();
    }
}