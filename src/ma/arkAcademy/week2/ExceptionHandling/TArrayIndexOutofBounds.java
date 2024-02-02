package ma.arkAcademy.week2.ExceptionHandling;

public class TArrayIndexOutofBounds {
    public static void main(String[] args) {
        try {
            int[] array = new int[]{1, 2, 3};
            System.out.println(array[3]);

        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println(exp);
        }
    }
}

