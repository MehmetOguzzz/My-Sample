package ARRAYS;

public class S03_Arrays {
    public static void main(String[] args) {
        //  String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz

        String[] str = new String[]{"selim", "alp", "oğuz", "gamze"};
        int sum = 0;
        for (String each : str) {
            sum = sum + each.length();
        }
        System.out.println("Karakter Sayısı Toplamı : " + sum);
    }
}
