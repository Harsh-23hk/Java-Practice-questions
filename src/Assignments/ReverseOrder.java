package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {

    public static List<Integer> reverseOrder(List<Integer> list) {
        List<Integer> newlist = new ArrayList<>();

        for (Integer elements : list) {
            if (!newlist.contains(elements)) {
                newlist.add(elements);
            }
        }
        Collections.reverse(newlist);

        return newlist;
    }
}

class ListRunner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(30);


        System.out.println(ReverseOrder.reverseOrder(list));

    }

}
