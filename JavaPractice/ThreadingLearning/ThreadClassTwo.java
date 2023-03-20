package JavaPractice.ThreadingLearning;

class TryingClassThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Working ");
        }
    }
}

class TryingClassThreadTwo extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("2nd ");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadClassTwo {
    public static void main(String[] args) {
        TryingClassThread t1 = new TryingClassThread();
        t1.start();
        TryingClassThreadTwo t2 = new TryingClassThreadTwo();
        t2.start();
    }
}
