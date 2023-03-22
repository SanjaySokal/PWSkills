package JavaPractice.ThreadingLearning;

public class InteruptMethod {
    public static void main(String[] args) {
        System.out.println("Thread started");
        InnerAliveJoinThread method = new InnerAliveJoinThread();
        Thread thread = new Thread(method);
        thread.start();
        thread.interrupt();
    }
}
