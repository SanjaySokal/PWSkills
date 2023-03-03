package JavaPractice.Interface;

interface Ac {
    void show();

    default void dis() {
        System.out.println("dis()");
    }
}

class Bc implements Ac {
    public void show() {
        System.out.println("show()");
    }
}

public class Java8Feature {
    public static void main(String[] args) {
        Bc b = new Bc();
        b.dis();
        b.show();
    }
}
