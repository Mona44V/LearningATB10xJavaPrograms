package JavaProgramming_Task;
import  java.util.Scanner;
public class Task_7thFeb_MultiplicationTable {

        public static void main(String[] args) {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the Number for Multiplication Table");
            int num= sc.nextInt();

            int a = 1;
            while (a<=10){
            int multi= a*num;
            System.out.println(+num+ "*"+a+ "="+multi);
            ++a;
        }
    }

}
