package Foundation.Maths_Problems;

public class Test006_ArmStrongNumber {
    public static void main(String[] args) {
        int lastDigit;
        int sum = 0;
        int num = 153;
        int originalNum = num;
        for(num =153; num>0; num = num /10){
            lastDigit = num %10;
            sum = sum+(lastDigit*lastDigit*lastDigit);
        }
        System.out.println(sum);

        if(sum==originalNum){
            System.out.println("Arm");
        }

    }
}
