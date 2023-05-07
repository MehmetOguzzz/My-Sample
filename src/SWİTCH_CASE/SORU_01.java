package SWİTCH_CASE;

import java.util.Scanner;

public class SORU_01 {
    public static void main(String[] args) {

        //Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
        // Örnek: 2000 yılının Şubat ayında gün sayısı 29.

                Scanner scanner = new Scanner(System.in);

                System.out.print("Yıl giriniz: ");
                int year = scanner.nextInt();

                System.out.print("Ay giriniz (1-12): ");
                int month = scanner.nextInt();

                int daysInMonth = 0;

                switch (month) {
                    case 1: // Ocak ayı
                    case 3: // Mart ayı
                    case 5: // Mayıs ayı
                    case 7: // Temmuz ayı
                    case 8: // Ağustos ayı
                    case 10: // Ekim ayı
                    case 12: // Aralık ayı
                        daysInMonth = 31;
                        break;
                    case 4: // Nisan ayı
                    case 6: // Haziran ayı
                    case 9: // Eylül ayı
                    case 11: // Kasım ayı
                        daysInMonth = 30;
                        break;
                    case 2: // Şubat ayı
                        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                            // Artık yıl ise, Şubat ayının gün sayısı 29'dur
                            daysInMonth = 29;
                        } else {
                            // Değilse, Şubat ayının gün sayısı 28'dir
                            daysInMonth = 28;
                        }
                        break;
                    default:
                        System.out.println("Hatalı ay girdiniz.");
                        return;
                }

                System.out.println(year + " yılının " + month + ". ayında " + daysInMonth + " gün vardır.");
            }
        }


