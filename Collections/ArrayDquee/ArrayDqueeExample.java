package Collections.ArrayDquee;

import java.util.ArrayDeque;

public class ArrayDqueeExample {
    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add("A");
        System.out.println(arrayDeque);
        arrayDeque.addFirst("first");
        arrayDeque.addLast("last");
        arrayDeque.offerFirst(20000);
        arrayDeque.offerLast(30000);
        System.out.println(arrayDeque);
    }
}
