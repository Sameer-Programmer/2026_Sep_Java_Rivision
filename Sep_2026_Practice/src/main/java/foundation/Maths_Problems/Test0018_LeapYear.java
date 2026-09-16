package foundation.Maths_Problems;

public class Test0018_LeapYear {
    public static void main(String[] args) {

       int num =2024;

       if(num%400==0){
           System.out.println("LeapYear");
       } else if (num%100==0) {
           System.out.println("Not LeapYear");
       } else if (num%4==0) {
           System.out.println("LeapYear");
       }else {
           System.out.println("Not LeapYear");
       }


    }
}
