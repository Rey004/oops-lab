// Write a JAVA Program to initialize an object through method.

class C {
    int id;
    String name;

    void student(int i, String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.println("id: " + id + " name: " + name);
    }

    public static void main(String[] args){
        C obj1 = new C();
        C obj2 = new C();

        obj1.student(1, "xyz");
        obj2.student(2, "abc");

        obj1.display();
        obj2.display();
    }
}
