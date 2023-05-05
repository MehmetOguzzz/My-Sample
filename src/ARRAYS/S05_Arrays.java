package ARRAYS;

import java.util.Arrays;

public class S05_Arrays {
    public static void main(String[] args) {
        //  Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        Integer[] arr = new Integer[]{9, 0, 0, 1, 9,4};
        Integer[] brr = new Integer[arr.length];
        int firstIdx = 0;
        int lastIdx = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[firstIdx] = arr[i];
                firstIdx++;
            } else {
                brr[lastIdx] = 0;
                lastIdx--;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}
