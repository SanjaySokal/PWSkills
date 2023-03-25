package Collections.ArrayList;

import java.util.ArrayList;

public class ListNew {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("list");
        System.out.println(list);
        list.add(12);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf(12));
    }
}
