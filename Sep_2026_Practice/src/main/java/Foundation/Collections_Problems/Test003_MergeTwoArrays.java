package Foundation.Collections_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Test003_MergeTwoArrays {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4};
        int arr2 [] = {5,6,7,8};

        ArrayList list =new ArrayList<>();
        for(int x :arr1){
            list.add(x);
        }
        ArrayList list2 =new ArrayList<>();
        for(int x :arr2){
            list2.add(x);
        }

        System.out.println(list);
        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);

    }
}
