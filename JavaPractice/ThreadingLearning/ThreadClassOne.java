package JavaPractice.ThreadingLearning;

public class ThreadClassOne {
    public static void main(String[] args) {
        String name2 = Thread.currentThread().getName();
        int prio2 = Thread.currentThread().getPriority();
        System.out.println(name2);
        System.out.println(prio2);

        System.out.println("---------------after changing----------------");

        Thread t = new Thread();
        t.setName("PW");
        t.setPriority(7);
        String name = Thread.currentThread().getName();
        int prio = Thread.currentThread().getPriority();
        System.out.println(name);
        System.out.println(prio);
    }
}
