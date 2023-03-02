package JavaPractice.Interface;

interface B {
    void show();
}

class A implements B {
    public void show() {
        System.out.println("Hello");
    }
}

public class InterfaceOne {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
