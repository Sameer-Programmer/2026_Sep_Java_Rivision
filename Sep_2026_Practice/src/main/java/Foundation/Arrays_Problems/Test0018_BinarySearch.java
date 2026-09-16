package Foundation.Arrays_Problems;

// NOTE Binary Search Works only if the Array is Sorted
public class Test0018_BinarySearch {
    public static void main(String[] args) {
        int []arr  = {1,2,3,4,5,6,8,9};
        int target = 8;

        int left =0;
        int right = arr.length -1;

        while(left<=right){
            int middle = (left+right)/2;
            if(arr[middle] == target){
                System.out.println("Target Found At Index    "+middle);
                return;
            }else if(arr[middle]> target){
                right = middle -1;
            }else{
                left = middle+1;
            }
        }
        System.out.println("targetNotFound");

    }
}
