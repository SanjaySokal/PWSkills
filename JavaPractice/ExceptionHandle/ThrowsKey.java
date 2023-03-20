package JavaPractice.ExceptionHandle;

public class ThrowsKey {
    public static void main(String[] args) {
        try {
            A();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("end");
        }
    }

    public static void A() throws Exception {
        System.out.println("A()");
        B();
    }

    private static void B() {
        System.out.println("B()");
        int num1 = 25;
        int num2 = 0;
        int res = num1 / num2;
        System.out.println(res);
    }
}
