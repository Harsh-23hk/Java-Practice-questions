package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DupRemove {

    public static List duplicateRemove(List<Integer> list) {
        List<Integer> newlist = new ArrayList<Integer>();

        for (Integer elements : list)
            if (!newlist.contains(elements)) {//
                newlist.add(elements);
            }

        return newlist;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,3, 7,8, 8,2,4, 9, 10));

        System.out.println(duplicateRemove(list));    }

}
