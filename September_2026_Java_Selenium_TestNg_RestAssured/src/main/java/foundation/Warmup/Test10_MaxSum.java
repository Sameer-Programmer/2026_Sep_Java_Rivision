package foundation.Warmup;

public class Test10_MaxSum {
    public static void main(String[] args) {
        int arr [] = {-1,-2,1,1,2,3};

        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tempstart = 0;

        for(int i = 0; i< arr.length;i++){
            currentSum = currentSum +arr[i];

            if(currentSum >maxSum){
                maxSum = currentSum;
                start =  tempstart;
                end = i;
            }
            if(currentSum < 0){
                currentSum = 0;
                tempstart = i+1;
            }
        }

        System.out.println(maxSum);
        System.out.println(start);
        System.out.println(end);




    }
}
