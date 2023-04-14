package ABSTRACT;

public class memur extends muhasebe{
    @Override
    protected int saatUcreti() {
        return 50;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "memur{" +
                "şirket ismi=" + sirketIsmi +
                ",saatUcreti=" + saatUcreti +
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
    memur memur1=new memur();
    memur1.saatUcreti=memur1.saatUcreti();
    memur1.aylikCalismaSuresi=memur1.aylikCalismaSuresi();
    memur1.maas=memur1.maas(memur1.saatUcreti, memur1.aylikCalismaSuresi);
    memur1.isim="OĞUZ";
    memur1.soyIsim="ALP";
    System.out.println(memur1);

    }
}
