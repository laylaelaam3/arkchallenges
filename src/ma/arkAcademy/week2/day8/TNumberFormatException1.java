package ma.arkAcademy.week2.day8;

public class TNumberFormatException1 {
    public static void main(String[] args) {
        try {
            int myint = Integer.parseInt("hi");
        } catch (NumberFormatException exp){
            System.out.println(exp);
        }
    }
}
