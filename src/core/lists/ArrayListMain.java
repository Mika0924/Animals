package core.lists;

import core.GBList;
import core.lists.GBArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();

        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

    }
}
