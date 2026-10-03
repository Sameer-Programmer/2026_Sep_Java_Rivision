package oops.Methods;

public class Test001 {

    public static String m1(int num){

        int hours = num/60;
        int minutes = num%60;
        return hours+":"+minutes;
    }

    public static void main(String[] args) {
        System.out.println(m1(60));
    }


}
