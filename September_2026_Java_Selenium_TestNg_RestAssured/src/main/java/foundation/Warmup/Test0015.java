package foundation.Warmup;

import java.util.Scanner;

public class Test0015 {

    public static String getData(int num){
        int hours = num/60;
        int min = num % 60;
        return hours+":"+min;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        int num = scanner.nextInt();
        System.out.println(getData(num));
    }
}
