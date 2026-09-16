package foundation.Warmup;

import java.util.ArrayList;

public class Test008_Dupl {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,1,2};

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

       for(int x :arr){
           if(list1.contains(x)){
               list2.add(x);
           }else {
               list1.add(x);
           }
       }
        System.out.println(list2);
        System.out.println(list1);



    }
}
