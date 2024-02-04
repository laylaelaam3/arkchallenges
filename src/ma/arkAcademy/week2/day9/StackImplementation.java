package ma.arkAcademy.week2.day9;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<String>list=new Stack<>();
        list.push("layla");
        list.push("Ahmed");
        list.push("Ghizlane");

        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(list.isEmpty());



        
    }
}
