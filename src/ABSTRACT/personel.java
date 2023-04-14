package ABSTRACT;

public class personel {

    static final String sirketIsmi="Aydın Çelik";
    static final String sirketAdresi="Aydın / Turkey";

    protected String isim="Deger Girilmemiş";
    protected String soyIsim="Deger Girilmemiş";
    protected String tcNo="Deger Girilmemiş";
    protected String telefon="Deger Girilmemiş";
    protected String iseBaslamaTarihi="Deger Girilmemiş";
    protected String sigortaNo="Deger Girilmemiş";
    static int personelSayac=1000;
    protected String personelNo;
    protected String personelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }



}
