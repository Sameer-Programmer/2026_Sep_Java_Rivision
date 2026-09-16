package Foundation.Warmup;

public class Test007_Min {
    public static void main(String[] args) {
        int arr [] = {11,2,3,4,5};
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i< arr.length;i++){
            if(min>arr[i]){ // it is reading how arr[i] greater than min
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
