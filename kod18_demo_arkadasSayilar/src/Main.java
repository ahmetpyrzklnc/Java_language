public class Main {

    public static void main(String[] args) {
        // bilinen en küçük iki arkadaş sayı 220 ve 284'dir
        // Arkadaş sayılar 220'nin 1'den başlayıp 220'ye kadar bölen sayısı toplamı 284 iken;
        // 284'ün ise 220'dür. Bu şekilde özetleyebiliriz.

        int sayi1 = 220; // önce birinci sayıyı tanımlayalım
        int sayi2 = 284; // sonra ikinci sayıyı tanımlayalım
        int toplam1 = 0; // birinci sayının bölenlerin toplamlarını tutacak değişkeni atadık
        int toplam2 = 0; // ikinci sayının bölenlerin toplamlarını tutacak değişkeni tanımladık

        for (int i = 1; i < sayi1; i++) { // önce sayı1'in 1'den başlayarak böldürelim ve 1 arttıralım
            if (sayi1 % i == 0) {  // eğer ki mod artık tam böldüğünde
                toplam1 = toplam1 + i; // toplam1 değişkeniyle i sayısını toplatalım
            }
        }

        for (int i = 1; i < sayi2; i++) { // yukarıdaki işlemin aynısı yapacağız
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplam1) { // iki durumda sağlanıyorsa
            System.out.println("Bu İki Sayı Arkadaştır..."); // bunu yazdır
        } else { // sağlanmıyorsa
            System.out.println("Bu İki Sayı Arkadaş Değildir."); // bunu yazdır
        }

        /*

        Burada && operatörü veya anlamına gelir ve iki şartı sağlarsa if bloğunu çalıştırır
        ama iki şartın biri olmuyorsa if bloğu çalışmaz.

        */

        // Bu şekilde 2 arakadaş sayı olup olmayacağını teyit eden bir algoritma geliştirmiş olduk
    }
}
