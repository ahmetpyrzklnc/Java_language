public class Main {

    public static void main(String[] args) {
        sayıBulmaca(); // eğer bunu silerseniz herhangi bir sonuç alamazsınız;
        sayıBulmaca();  // bu kod blokunu commanda atıp deneyin// bu kod blokunu commanda atıp deneyin
        sayıBulmaca();
        sayıBulmaca(); // bu şekilde bu fonksiyonu istediğimiz zaman tekrardan çağırabiliriz
    }

    public static void sayıBulmaca() {
        int[] sayilar = new int[]{1, 2, 4, 5, 6, 8};
        int bulunacakSayi = 8;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == bulunacakSayi) {
                varMi = true;
                break;
            }
        }
        String mesaj1 = ""; // öncelikle mesaj 1'i tanımladım
        String mesaj2 = ""; // sonrasında mesaj 2'yi
        if (varMi) {
            mesaj1 = "Sayı mevcuttur: " + bulunacakSayi;
            mesajVer(mesaj1);
        } else {
            mesaj2 = "Sayı mevcut değildir: " + bulunacakSayi;
            mesajVer(mesaj2);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);

    }
}


