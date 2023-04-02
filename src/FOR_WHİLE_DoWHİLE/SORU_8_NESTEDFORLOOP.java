package FOR_WHİLE_DoWHİLE;

public class SORU_8_NESTEDFORLOOP {
    public static void main(String[] args) {
        int sayi=4;
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println("");
            //1 2 3 4
            //2 4 6 8
            //3 6 9 12
            //4 8 12 16

        }
    }
}
