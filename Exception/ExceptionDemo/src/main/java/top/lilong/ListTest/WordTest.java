package top.lilong.ListTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class WordTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("orange");
        list.add("tomato");
        list.add("apple");
        list.add("litchi");
        list.add("banana");
        System.out.println("排序前");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(list.get(i)+"   ");
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(0)>o2.charAt(0))
                    return 1;
                else
                    return -1;
            }
        });
        System.out.println();
        System.out.println("排序后");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.printf(iterator.next()+"   ");
        }
    }
}
