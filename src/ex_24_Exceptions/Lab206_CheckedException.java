package ex_24_Exceptions;

public class Lab206_CheckedException {
    public static void main(String[] args) {
        int a=1;

        try{
            int b = a/0;
        } catch (Exception e) {
           throw new RuntimeException(e);
        //System.out.print(e.getMessage());
        //e.printStackTrace();

        }

    }
}
