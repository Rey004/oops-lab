// write a java program for deserialization 

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Exp6B {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
            Student s = (Student) in.readObject();
            System.out.println(s.getId() + " " + s.getName());
            in.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}