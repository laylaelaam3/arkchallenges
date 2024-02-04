package ma.arkAcademy.week2.day9;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 11, 13, 20};
        System.out.println(binarySearch(arr, 13));
    }

    private static int binarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int middleposition = (low + high) / 2;
            int middlenumber = numbers[middleposition];
            if (numberToFind == middlenumber) {
                return middleposition;
            }
            if (numberToFind < middlenumber) {
                high = middleposition - 1;
            } else {
                low = middleposition + 1;
            }
        }
        return -1;
    }
}
