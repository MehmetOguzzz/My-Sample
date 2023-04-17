package FOR_WHİLE_DoWHİLE;

import java.util.Scanner;

public class SORU_2_WHİLE {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
        //toplami yazdirin.
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        while (toplam<=500){
            System.out.println("Toplanmak üzere sayılar giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Sayılar Toplamı : " + toplam);

    }
}


