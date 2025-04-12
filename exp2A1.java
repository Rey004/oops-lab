// 2A: Write a java program, initialize the object using constructor(No argument and parameterized constructor)
// Part 1

class A1 {
    int value;
    String name;
    
    public A1() {
        value = 0;
        name = "Default";
    }
    
    public static void main(String[] args) {
        A1 obj1 = new A1();

        System.out.println("value: " + obj1.value + ", name: " + obj1.name);
    }
}
