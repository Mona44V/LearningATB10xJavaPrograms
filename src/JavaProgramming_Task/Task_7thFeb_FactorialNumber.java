package JavaProgramming_Task;

import java.util.Scanner;

public class Task_7thFeb_FactorialNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number for Factorial Calculation");
        int num= sc.nextInt();
        int Cal=1;
        for (int i=num; i>=1;--i)
        {
            Cal=Cal*num;
        }
        System.out.println("Factorial of input number is: "+Cal);
    }
}
