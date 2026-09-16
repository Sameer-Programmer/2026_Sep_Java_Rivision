package foundation.Collections_Problems;

import java.util.ArrayList;

public class Test002_MoveZeros {
    public static void main(String[] args) {
        int [] arr = {0,0,1,2,3,4,5,6,7,8,9,1,2,3,4};
        ArrayList list  = new ArrayList();
        for(int x: arr){
            if(x!=0){
                list.add(x);
            }
        }
        ArrayList list2  = new ArrayList();
        for(int x: arr){
            if(x==0){
                list2.add(x);
            }
        }

        list.addAll(list2);
        System.out.println(list);

    }
}
