package ARRAYS;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class S02_Arrays {
    public static void main(String[] args) {
        //String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.


        String[] wordArr = new String[]{"Hakan", "Nazan", "Selim", "Tarak"};

        String newArr="";

        for (String each:wordArr
             ) {
            if (each.endsWith("n") || each.endsWith("k")){

                newArr=newArr + each.substring(0,1);
            }
        }
        System.out.println(newArr);//HNT

    }
}
