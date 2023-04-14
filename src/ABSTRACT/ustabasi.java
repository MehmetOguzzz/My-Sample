package ABSTRACT;

public class ustabasi extends isci{
    //burda itiraz etmedi implement etmek zorundasın demedi,
    //sebebi, ustabası işçi class'ının child classıdır,
    //işçi sınıfında override ettiğimiz için yukarıdaki abstract methodları bir daha kendine uyarlamsı sart değil
    //ama projemizin calısması için bunu manuel yapmalıyız


    @Override
    protected int saatUcreti() {
        return 15;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    public static void main(String[] args) {
        ustabasi ustabasi1=new ustabasi();
        ustabasi1.saatUcreti=ustabasi1.saatUcreti();
        ustabasi1.aylikCalismaSuresi=ustabasi1.aylikCalismaSuresi();
        ustabasi1.maas=ustabasi1.maas(ustabasi1.saatUcreti, ustabasi1.aylikCalismaSuresi);
        ustabasi1.isim="MESUT";
        ustabasi1.soyIsim="PEKMESUT";
        System.out.println(ustabasi1);

    }
}
