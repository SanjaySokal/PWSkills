package JavaPractice.Inherit;

class ClassTwo {
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

public class ExampleOne {
    public static void main(String[] args) {
    }
}
