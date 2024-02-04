package ma.arkAcademy.week2.day9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue list= new LinkedList();
        list.add("Java");
        //list.add("SQL");
        //list.add(("python"));
        System.out.println(list.remove());
        System.out.println(list.element());
        System.out.println(list.isEmpty());
    }
}
