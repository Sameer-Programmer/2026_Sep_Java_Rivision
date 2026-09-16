package foundation.Maths_Problems;

public class Test007_Reverse {
    public static void main(String[] args) {
        int num = 123;
        int reverse = 0;
        int lastDigit;
        for(;num>0;num = num/10){
            lastDigit = num %10;
            reverse = reverse *10 + lastDigit;
        }
        System.out.println(reverse);
    }
}
