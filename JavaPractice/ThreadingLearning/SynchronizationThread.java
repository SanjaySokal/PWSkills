package JavaPractice.ThreadingLearning;

class InnerSynchronizationThread implements Runnable {
    synchronized public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " stopped running");
    }
}

public class SynchronizationThread {
    public static void main(String[] args) {
        InnerSynchronizationThread th = new InnerSynchronizationThread();
        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);
        Thread t3 = new Thread(th);
        t1.setName("Sanjay Sokal");
        t2.setName("Sokal Sanjay");
        t3.setName("Khairoli");
        t1.start();
        t2.start();
        t3.start();
    }
}
