// Write a Java program to display the priority of three threads

class Exp7C extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Exp7C t1 = new Exp7C();
        Exp7C t2 = new Exp7C();
        Exp7C t3 = new Exp7C();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}


