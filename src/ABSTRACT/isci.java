package ABSTRACT;

import com.sun.tools.javac.Main;

public class isci extends muhasebe {

    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;



    }

    @Override
    public String toString() {
        return "isci{" +
                "şirket ismi=" + sirketIsmi +
                ",saatUcreti="+saatUcreti +
                ", aylikCalismaSuresi=" + aylikCalismaSuresi +
                ", maas=" + maas +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        isci isci1=new isci();
        isci1.saatUcreti=isci1.saatUcreti();
        isci1.aylikCalismaSuresi=isci1.aylikCalismaSuresi();//methodu variable ' a atama yapıyoruz...
        isci1.maas=isci1.maas(isci1.saatUcreti,isci1.aylikCalismaSuresi);
        isci1.isim="Selim";
        isci1.soyIsim="Alp";
        System.out.println(isci1);

    }
}
