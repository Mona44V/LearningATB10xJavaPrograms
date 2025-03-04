package CodingQuestion_250;

import java.util.Scanner;

/*
Leap Year Checker:
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
 Use an if-else statement to make this determination.
 */
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year to check: ");
        int G = sc.nextInt();
        boolean Y = false;
        if(G%4==0){
            Y = true;
              if(G%100==0){
                if(G%400==0) {
                    Y = true;
                }
                else{
                        Y = false;
                    }
            }
        }
        else {
                  Y = false;;

        }
        if(!Y){
            System.out.println("Not a Leap Year");
        }
        else{
            System.out.println("Leap Year");
        }
    }




}
