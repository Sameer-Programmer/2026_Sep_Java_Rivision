package foundation.Warmup;

public class Test006_BinarySearch {
    public static void main(String[] args) {
        int [] arr = {0,1,12,23,34,45,56,67,89};

        int target = 23;
        int left = 0;
        int right = arr.length-1;

        while (left<=right){
            int middle = (left+right)/2;
            if(arr[middle]==target){
                System.out.println("Target Fond at Index  "+middle);
                return;
            }else if(arr[middle]>target){
                right = middle -1;
            }else {
                left = middle+1;
            }
        }
        System.out.println("Target Not found");



    }
}
