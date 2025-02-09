package JavaProgramming_Task;

public class Task_7thFeb_FactorialNumber {
    public static void main(String[] args){
        System.out.println("Sum Calculation starts from 1 upto 100");
        int sum=0;
        for (int num=1; num<=100;++num)
        {
            sum=sum+num;
        }
        System.out.println("Sum from 1 to 100 is: "+sum);
    }
}
