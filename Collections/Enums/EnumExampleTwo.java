package Collections.Enums;

public class EnumExampleTwo {
    enum NewEnum {
        HELLO, HII;

        int a = 25;

        NewEnum() {
            System.out.println("EnumExampleTwo.NewEnum.NewEnum()");
        }

        void setVal(int a) {
            this.a = a;
        }

        int getter() {
            return a;
        }
    }

    public static void main(String[] args) {
        NewEnum hello = NewEnum.HELLO;
        System.out.println(hello);

        hello.setVal(50);
        System.out.println(hello.getter());
    }
}
