package ma.arkAcademy.week2.day9;

import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(2);
        for(Integer a:list)
            System.out.println(a);
        Collections.reverse(list);
        System.out.println(list);




    }
}
