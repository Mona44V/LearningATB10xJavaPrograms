package ex_15_String_Functions;
import java.lang.String;

public class Lab001_String_Function {
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "Hello";
        String S3 = new String("Hello");
        System.out.println(S1 == S2);
        System.out.println(S1.equals(S3));
    }
}
