package ma.arkAcademy.week2.day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUserInputValidation {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive number");
try{
        do {

            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("enter a positive number");

            } else {
                System.out.println("valid number");
            }
        }
        while (n < 0);}
catch (InputMismatchException e){
    System.out.println("Invalid input. Please enter a valid number.");
  n= scanner.nextInt();
    System.out.println(e.getMessage());
}


    }
}






