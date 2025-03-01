package ex_24_Exceptions;

public class Lab205_Exceptiontype {
    public static void main(String[] args) {
        int a =0;
        int b=10;
        int c= b/a;   //Arithmetic Exception---Unchecked/Runtime Exception
        System.out.println(c);

        //String st="         ghntj";
        String st=null;   //NullPointer Exception---Unchecked/Runtime Exception
        String re=st.trim();
        System.out.println(re);


    }
}
