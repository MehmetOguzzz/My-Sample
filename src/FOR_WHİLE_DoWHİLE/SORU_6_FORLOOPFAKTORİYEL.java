package FOR_WHİLE_DoWHİLE;

import java.util.Scanner;

public class SORU_6_FORLOOPFAKTORİYEL {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin

        Scanner scan=new Scanner(System.in);
        int sayi=5;
        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoriyel*=i;
        }
        System.out.println(sayi + "! = " + faktoriyel);
    }
}
