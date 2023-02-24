package JavaPractice.Inherit;

class ClassTwo {
    private int b = 35;
    // will not be accessable
    int a = 25;

    ClassTwo() {
        System.out.println("ClassTwo Constructor run()");
    }

    void run() {
        System.out.println("ClassTwo run()");
    }
}

class ClassThree extends ClassTwo {
}

public class ClassOne {
    public static void main(String[] args) {
        ClassThree classThree = new ClassThree();
        classThree.run();
        System.out.println(classThree.a);
    }
}
