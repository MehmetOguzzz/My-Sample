package ARRAYS;

import java.util.Arrays;

public class S01_Arrays {
    //Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
    //bulunuz.

        public static void main(String[] args) {

        int[] arr = new int[]{-19, 9, -7, 13, -1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-19, -7, -1, 9, 13]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i + 1] > 0) {

                System.out.println("minumum positive value : " + arr[i + 1]);
                System.out.println("maximum negative value : " + arr[i]);

            }

        }


    }

}
