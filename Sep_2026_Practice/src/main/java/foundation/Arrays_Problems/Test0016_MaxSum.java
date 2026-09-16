package foundation.Arrays_Problems;
//Maximum Sum of a Continuous (Contiguous) Subarray
public class Test0016_MaxSum {
    public static void main(String[] args) {
        int [] arr = {-1,-1,-1,-2,-3};
        int currentsum = 0;
        int MaxSum = Integer.MIN_VALUE; // What is Pupose of writing this line Here

        /*
        // MaxSum starts with the smallest possible int value.
// This ensures negative sums can also become MaxSum.
// Integer.MIN_VALUE = -2,147,483,648
//
// Example: {-5, -2, -8} → MaxSum = -2
//
// Do NOT initialize with 0, because all-negative arrays
// would incorrectly return 0.
int MaxSum = Integer.MIN_VALUE;
         */

        for(int i = 0; i< arr.length; i++){
            currentsum = currentsum +arr[i];

            if(currentsum>MaxSum){
                MaxSum = currentsum;
            }

            if(currentsum <0){
                currentsum = 0;
            }
        }

        System.out.println(MaxSum);

    }
}
