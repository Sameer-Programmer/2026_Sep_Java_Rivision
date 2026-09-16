package Foundation.Collections_Problems;

import java.util.Arrays;
import java.util.HashSet;

public class Test001_RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4};

        HashSet<Integer> set =new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        System.out.println(set);

        Integer [] arr2=set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));



//        int [] arr2 = new int[set.size()];
//        int i = 0;
//
//      for(int x :set){
//         arr2[i] = x;
//         i++;
//      }

    }


}

/*
Array → Set
Set<Integer> set = new HashSet<>(Arrays.asList(arr)); //works with only Objects

Set → Array
Integer[] arr = set.toArray(new Integer[0]);
 */