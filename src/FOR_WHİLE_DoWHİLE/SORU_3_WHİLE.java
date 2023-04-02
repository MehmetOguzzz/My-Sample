package FOR_WHİLE_DoWHİLE;

import java.util.Scanner;

public class SORU_3_WHİLE {
    public static void main(String[] args) {
        //Soru : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan
        //sifrelerde hatalari yazdirip, kullanicinin yeni sifre girmesi isteyin
        //Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre
        //yazilinca “sifreniz basari ile kaydedildi” yazdirin
        //sartlar :
        //- sifrenin ilk karakteri kucuk harf
        //olmali
        //- sifrenin son karakteri sayi olmali

        Scanner scan=new Scanner(System.in);
        boolean sifredogruMu=false;
        String sifre="";
        char ilkHarf;
        char sonHarf;

        while (!sifredogruMu){
            System.out.println("Lütfen bir şifre giriniz");
            sifre= scan.nextLine();
            ilkHarf=sifre.charAt(0);
            sonHarf=sifre.charAt(sifre.length()-1);

            if (ilkHarf<'a' || ilkHarf>'z'){
                System.out.println("İlk harfi küçük harf olmalı!");

            } else if (sonHarf<'0' || sonHarf>'9') {
                System.out.println("Şifreniz rakam ile bitmelidir!");

            }else{
                System.out.println("Şifreniz Başarıyla Olusturulmustur");
                sifredogruMu=true;
            }

        }

    }
}
