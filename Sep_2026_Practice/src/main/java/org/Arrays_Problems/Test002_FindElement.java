package org.Arrays_Problems;

public class Test002_FindElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int value = 15;
        boolean found = false;

        for(int x : arr){
            if(x==value){

                found = true;
                break;
            }
        }

        if(found){
            System.out.println("value found ");
        }else {
            System.out.println("value Notfound ");
        }


    }
}
