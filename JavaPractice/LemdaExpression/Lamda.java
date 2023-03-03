package JavaPractice.LemdaExpression;

interface I {
    void dis();
}

public class Lamda {
    public static void main(String[] args) {
        I i = () -> System.out.println("Hello");
        i.dis();
    }
}
