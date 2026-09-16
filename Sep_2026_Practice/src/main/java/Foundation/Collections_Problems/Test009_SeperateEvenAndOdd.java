package Foundation.Collections_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Test009_SeperateEvenAndOdd {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        for(int x:arr){
            if(x%2==0){
                list1.add(x);
            }else {
                list2.add(x);
            }
        }

//        System.out.println(list1);
//        System.out.println(list2);
       Integer [] arr1 = list1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr1));
        Integer [] arr2 = list2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));



    }
}
