package DSA.Recurssion;

public class AddNumber {
    public static void main(String[] args) {
        AddNumber addNumber = new AddNumber();
        System.out.println(addNumber.SumOfAll(3));
    }

    int SumOfAll(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * SumOfAll(n - 1);
        }
    }
}