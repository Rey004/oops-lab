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

public class Exp6A {
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "John Doe");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(student);
            out.close();
            System.out.println("Serialization successful");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e);
        }
    }
}