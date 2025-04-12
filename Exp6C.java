// write a java program for serialization and deserialization with inheritance

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {                                                                                                                                                                                                                                                                                                                                                                                                                               
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private static final long serialVersionUID = 1L;
    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class Exp6C {
    public static void main(String[] args) {
        
        try {
            Student student = new Student("John Doe", 20, 12345);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(student);
            out.close();
            System.out.println("Serialization successful");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e);
        }

        
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            Student student = (Student) in.readObject();
            in.close();
            System.out.println("Deserialization successful");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("ID: " + student.getId());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e);
        }
    }
}



