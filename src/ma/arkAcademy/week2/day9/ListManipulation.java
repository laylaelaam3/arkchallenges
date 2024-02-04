package ma.arkAcademy.week2.day9;

import java.util.ArrayList;
import java.util.Arrays;

public class ListManipulation {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("Layla","Ilham","Kawtar","kenza"));
        list.add("jamila");
        list.remove("Kawtar");
        System.out.println(list.contains("Layla"));
        System.out.println(list);

    }
}
