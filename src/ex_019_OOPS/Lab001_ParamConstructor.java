package ex_019_OOPS;

public class Lab001_ParamConstructor {
    public static void main(String[] args) {
        //Mobile Iphone = new Mobile("13","2020");
        //Mobile Samsung = new Mobile("S12","2021");

    }

    class Mobile{
        String modelname;
        String year;

        Mobile(String modelnameC,String Launch){
            this.modelname=modelnameC;
            this.year=Launch;
        }
    }
}
