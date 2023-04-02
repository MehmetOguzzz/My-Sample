package FOR_WHİLE_DoWHİLE;

import java.util.Scanner;

public class SORU_1_FORLOOP {
    /*Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bas=20;
        int bit=40;
        int toplam=0;

        if (bas>bit){
            System.out.println("Bitiş Değeri Başlangıç Değerinden Büyük Olmalıdır...");
        }else{
            for (int i = bas; i <=bit ; i++) {
                toplam+=i;
            }
            System.out.println("Girilen sayıların toplamı : " + toplam);
        }
    }

}
