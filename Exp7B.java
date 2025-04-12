//write a java program to create a thread by implementing the Runnable interface

class Exp7B implements Runnable {
    public void run() {
        System.out.println("Runable Thread is running");
    }

    public static void main(String args[]) {
        Thread m1 = new Thread(new Exp7B());
        m1.start();
    }
}
