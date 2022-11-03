import java.util.Arrays;

import java.lang.reflect.Array;

public class tekrarEdenCiftSayilar {
    static boolean isFind(int[] arr , int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2,4,5,6,6,7,2,4,6,8,8,};
        int[] tek = new int[list.length];
        int[] cift = new int[list.length];

        int startIndex = 0;

        for(int i = 0; i < list.length; i++ ){
            if(list[i] % 2 == 0){
                cift[i] = list[i];

            }
            }
        System.out.println();
        for(int value : cift){
            if(value != 0){
                System.out.println(value + " ");
            }
        }
        }
    }

