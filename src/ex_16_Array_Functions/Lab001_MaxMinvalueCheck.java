package ex_16_Array_Functions;

public class Lab001_MaxMinvalueCheck {
    public static void main(String[] args){

        int[] arr= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = arr[0];
        int min = arr[0];
        for (int i=0; i<arr.length;i++){
                if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value is: "+max);
        for (int i=0; i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimu value is: "+min);
    }
}
