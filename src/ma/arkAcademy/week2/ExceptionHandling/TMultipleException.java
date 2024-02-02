package ma.arkAcademy.week2.ExceptionHandling;


public class TMultipleException {
    public static void main(String[] args) {


        try {
            // Division operation
            int result = divide(10, 0);

            System.out.println("Result of division: " + result);

            // Array access operation
            int[] numbers = {1, 2, 3};
            accessArray(numbers, 3);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Exception: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) {
        int result = numerator / denominator;
        System.out.println("Division result: " + result);
        return result;
    }

    public static void accessArray(int[] array, int index) {
        System.out.println("Value at index " + index + ": " + array[index]);
    }
}

