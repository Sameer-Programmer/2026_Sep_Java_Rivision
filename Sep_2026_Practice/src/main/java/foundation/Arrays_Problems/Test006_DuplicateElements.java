package foundation.Arrays_Problems;

public class Test006_DuplicateElements {
    public static void main(String[] args) {
        int [] arr = {11,2,3,4,5,6,7,8,9,0,1,2,3};
        int count =0;

        for(int i = 0; i<arr.length; i++){

            for(int j =i+1; j< arr.length;j++){
                if(arr[j]==arr[i]){
                    System.out.println(arr[i]);
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}

/*
11->2,3,4,5,6,
2-->2
 */