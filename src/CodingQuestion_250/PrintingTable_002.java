package CodingQuestion_250;
import java.sql.SQLOutput;
import java.util.Scanner;

//Print  lines of output; each line  (where ) contains the  of  in the form:
//N x i = result.
public class PrintingTable_002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired Number:");
        int num = sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(+num+"*"+i+ "="+num*i);
        }
    }
}
