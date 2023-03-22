package JavaPractice.ThreadingLearning;

class InhertClassA implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" --- " + i);
        }
    }
}

class InhertClassB implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" i = " + i);
        }
    }
}

public class MyltiThreadingInheritance {
    public static void main(String[] args) {
        InhertClassA a = new InhertClassA();
        InhertClassB b = new InhertClassB();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
