package ma.arkAcademy.week2.day9;

import java.util.Arrays;

public class Arrayoperation {
    public static void main(String[] args) {
        int [] arr={1,15,5,8};
        int sum=0;

        for(int i=0; i<arr.length;i++){
           // sum+=arr[i];
            sum=sum+arr[i];



        }
        System.out.println("sum = "+sum);
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        Arrays.sort(arr);
        for(int i=arr.length;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        }

    }


