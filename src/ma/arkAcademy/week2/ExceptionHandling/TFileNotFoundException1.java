package ma.arkAcademy.week2.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TFileNotFoundException1 {
    public static void main(String[] args) {

        try {
            String fileName="text.text";
            File file=new File(fileName);
            Scanner scan =new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
