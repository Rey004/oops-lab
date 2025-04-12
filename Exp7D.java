// Write a Java program to set new priority of a thread

class Exp7D extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Exp7D thread = new Exp7D();

        thread.setName("MyThread");

        System.out.println(thread.getName() + " default priority: " + thread.getPriority());

      
        thread.setPriority(7);

        System.out.println(thread.getName() + " new priority: " + thread.getPriority());

        thread.start();
    }
}

