// Write a Java program to create a thread by extending the Thread class

class Exp7A extends Thread {
    public void run() {
            System.out.println("Thread is running");
        }
    
    public static void main(String args[]) {
        Exp7A m1 = new Exp7A();
        m1.start();   
    }
}