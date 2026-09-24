package foundation.Arrays_Problems;

public class Test0019_Sum_AND_Avg {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
        int avg = (int )sum/ arr.length;
        System.out.println(avg);

    }
}
