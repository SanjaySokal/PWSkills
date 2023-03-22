package JavaPractice.ThreadingLearning;

class InnerAliveJoinThread implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("in Loop");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class AliveJoinThread {
    public static void main(String[] args) {
        System.out.println("Thread started");
        InnerAliveJoinThread method = new InnerAliveJoinThread();
        Thread thread = new Thread(method);
        System.out.println(thread.isAlive());
        thread.start();

        try {
            thread.join();
            System.out.println(thread.isAlive());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thread ended");
    }
}
