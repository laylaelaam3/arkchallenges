package ma.arkAcademy.week2.day8;

public class CustomExceptiontest {
    public static void main(String[] args) {
        try{
            int i = -5;
            if(i<0){
                throw new TCustomException("input must be positive");
            }
        }catch (TCustomException e){
            System.out.println(e.getMessage());
        }

    }
}
