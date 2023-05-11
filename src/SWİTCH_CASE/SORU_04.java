package SWİTCH_CASE;

import java.util.Scanner;

public class SORU_04 {
    public static void main(String[] args) {
        //kullanıcıdan 2 basamaklı bir sayı alın,
        //girilen sayıyı yazı ile yazıdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 basamakli bir sayi girin");
        int sayi = scan.nextInt();

        int birler = sayi % 10;
        int onlar = sayi / 10;
        if (sayi < 10 || sayi > 99) {

            System.out.println("yanlis giris, iki basamakli sayi giriniz");
        } else {

            switch (onlar) {
                case 1:
                    System.out.println(sayi + ":on");
                    break;
                case 2:
                    System.out.println(sayi + ":yirmi");
                    break;
                case 3:
                    System.out.println(sayi + ":otuz");
                    break;
                case 4:
                    System.out.println(sayi + ":kırk");
                    break;
                case 5:
                    System.out.println(sayi + ":elli");
                    break;
                case 6:
                    System.out.println(sayi + ":altmış");
                    break;
                case 7:
                    System.out.println(sayi + ":yetmiş");
                    break;
                case 8:
                    System.out.println(sayi + ":seksen");
                    break;
                case 9:
                    System.out.println(sayi + ":doksan");
                    break;
            }
            switch (birler) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üc");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;


            }
        }
    }
}
