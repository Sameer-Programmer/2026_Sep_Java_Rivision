package foundation.Warmup;

public class Test0013 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,18,9};
        int target = 8;

        int left = 0;
        int right = arr.length-1;

        System.out.println(arr[(left+right)/2]);

        while(left<=right){
            int middle = (left+right)/2;

            if(arr[middle] == target){
                System.out.println("target found");
                System.out.println(middle);
                return;
            } else if (arr[middle]>target) {
                right = middle-1;
            } else if (arr[middle]<target) {
                left = middle +1;
            }
        }
        System.out.println(" target not found ");


    }

}
