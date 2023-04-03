package IFSTATEMENT;

import java.util.Scanner;

public class SORU_1_AyAdiYazdirma {
    /*
     Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
     a) Aralık, Ocak, Şubat için "Kış"
     b) Mart, Nisan, Mayıs için "İlkbahar"
     c) Haziran, Temmuz, Ağustos için "Yaz"
     d) Eylül, Ekim, Kasım için "Sonbahar"
     e) Diğerleri için "Geçersiz ay adı"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir ay adı giriniz");
        String ayAdi = scan.nextLine();
        ayAdi = ayAdi.toLowerCase();

        if (ayAdi.equalsIgnoreCase("aralık") || ayAdi.equalsIgnoreCase("ocak") || ayAdi.equalsIgnoreCase("şubat")) {
            System.out.println("kış");
        } else if (ayAdi.equalsIgnoreCase("mart") || ayAdi.equalsIgnoreCase("nisan") || ayAdi.equalsIgnoreCase("mayıs")) {
            System.out.println("ilkbahar");

        } else if (ayAdi.equalsIgnoreCase("haziran") || ayAdi.equalsIgnoreCase("temmuz") || ayAdi.equalsIgnoreCase("agustos")) {
            System.out.println("yaz");

        } else if (ayAdi.equalsIgnoreCase("eylül") || ayAdi.equalsIgnoreCase("ekim") || ayAdi.equalsIgnoreCase("kasım")) {
            System.out.println("sonbahar");
        } else {
            System.out.println("geçersiz ay adı");
        }
    }
}
