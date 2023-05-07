package SWİTCH_CASE;

import java.util.Scanner;

public class SORU_02 {
    public static void main(String[] args) {

        /*
        Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
        yapan basit bir hesap makinesi oluşturmak için kod yazınız.
                a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
                b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
                c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
                d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
                e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        System.out.print("İşlemi girin (+, -, *, /): ");
        char islem = scanner.next().charAt(0);
        double sonuc = 0.0;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 == 0) {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                    return;
                }
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }
        System.out.println("Sonuç: " + sonuc);
    }
}

