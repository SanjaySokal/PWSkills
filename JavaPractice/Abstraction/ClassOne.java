package JavaPractice.Abstraction;

abstract class ClassFour {
    int a = 25;

    abstract void show();
}

class ClassFive extends ClassFour {
    void show() {
        System.out.println(a);
    }
}

public class ClassOne {
    public static void main(String[] args) {
        ClassFive fv = new ClassFive();
        fv.show();
        System.out.println(fv.a);
    }
}
