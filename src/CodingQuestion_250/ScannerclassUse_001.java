package CodingQuestion_250;

import java.util.Scanner;

//How to Take Input from Users?
public class ScannerclassUse_001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String UserName = sc.nextLine();
        System.out.println("Enter Your Age:");
        int UserAge = sc.nextInt();
        System.out.println("Hello "+UserName+ ". Welcome to Java!");
        sc.close();
    }
}
