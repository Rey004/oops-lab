// 2A: Write a java program, initialize the object using constructor(No argument and parameterized constructor)
// Part 2

class A2 {
    int value;
    String name;

    public A2(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static void main(String[] args) {
        A2 obj2 = new A2(42, "Test");

        System.out.println("value: " + obj2.value + ", name: " + obj2.name);
    }
}
