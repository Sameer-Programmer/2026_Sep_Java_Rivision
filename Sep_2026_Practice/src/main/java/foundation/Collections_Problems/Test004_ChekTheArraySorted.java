package foundation.Collections_Problems;

import java.util.ArrayList;

public class Test004_ChekTheArraySorted {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        ArrayList<Integer>list = new ArrayList<>();
        for(int x :arr){
            list.add(x);
        }
        boolean isSorted = true;

        for(int i = 0; i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                isSorted = false;
            }
        }

        if(isSorted){
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }


    }
}
