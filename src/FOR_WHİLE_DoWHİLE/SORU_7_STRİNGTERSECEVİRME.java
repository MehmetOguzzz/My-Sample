package FOR_WHİLE_DoWHİLE;

public class SORU_7_STRİNGTERSECEVİRME {
    public static void main(String[] args) {
        //Kullanıcıdan bir string isteyin
        //ve stringi tersine cevirip kaydedin

        String Input="java candır";
        String output="";
        for (int i = Input.length()-1; i >=0 ; i--) {
            output+=Input.charAt(i);

        }
        System.out.println(output);
    }
}
