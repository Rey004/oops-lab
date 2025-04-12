// 2C: Write a java program for constructor overloading

class C {
    int rollno;
    String name;
    String section;

    public C(int rollno, String name, String section) {
        this.rollno = rollno;
        this.name = name;
        this.section = section;
        
    }

    public C(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void main(String[] args) {
        C obj1 = new C(1, "xyz", "O2");
        C obj2 = new C(2, "abc");

        System.out.println("Roll no: " + obj1.rollno + ", Name: " + obj1.name + ", Section: " + obj1.section);
        System.out.println("Roll no: " + obj2.rollno + ", Name: " + obj2.name);
    }
}
