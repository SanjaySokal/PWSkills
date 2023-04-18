package Apis;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3543);
        list.add(2545);
        list.add(7512);
        
        Stream<Integer> s1 = list.stream();

        System.out.println(s1.count());
    }
}
