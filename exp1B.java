// Write a JAVA program to create multiple object in a different class for main method and store information in it through reference variable.

class Student{
    int id;
    String name;
}

class B{
    public static void main(String[] args){
        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.id = 1;
        obj1.name = "xyz";

        obj2.id = 2;
        obj2.name = "abc";


        System.out.println("id: " + obj1.id + " name: " + obj1.name);
        System.out.println("id: " + obj2.id + " name: " + obj2.name);
    }
}
