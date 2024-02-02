package ma.arkAcademy.week2.ExceptionHandling;

import java.util.ArrayList;

public class TNullPointerException {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = null;
            list.get(0);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
