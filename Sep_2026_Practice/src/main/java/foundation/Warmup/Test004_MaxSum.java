package foundation.Warmup;

public class Test004_MaxSum {
    public static void main(String[] args) {
        int [] arr = {-1,-1,1,2,3};

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tempStart = 0 ;//why this in needed

        for(int i = 0; i<arr.length; i++){
            currentSum = currentSum +arr[i];

            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end =i;
            }

            if(currentSum <0){
                currentSum = 0;
                tempStart = i+1; // why here temp start = i+1
            }
        }

        System.out.println(maxSum);
        System.out.println(start);
        System.out.println(end);
    }
}

