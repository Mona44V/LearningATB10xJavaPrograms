package JavaProgramming_Task;
import java.util.Scanner;

public class Task_19thJanGradeCalculator {
    public static void main(String[] args) {
        /*
        score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the grade: ");
        int G = sc.nextInt();

        if (G>=90 && G <=100){
            System.out.println("Grade is A");

        } else if (G>=80 && G <=89) {
            System.out.println("Grade is B");
        }
        else if (G>=70 && G <=79) {
            System.out.println("Grade is C");
       }
        else if (G>=60 && G <=69) {
            System.out.println("Grade is D");
        }

        else{
            System.out.println("Grade is F");
        }
    }
}
