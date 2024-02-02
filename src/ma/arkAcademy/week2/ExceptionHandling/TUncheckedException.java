package ma.arkAcademy.week2.ExceptionHandling;

public class TUncheckedException {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("Please make sure the object is not null before accessing its properties.");
        }
    }
}

