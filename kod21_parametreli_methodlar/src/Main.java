public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer(); // string metodu olduğu için sayı metodunu koyamazsın hata verir
        System.out.println(yeniMesaj); // yeni mesajı alttaki fonksiyona bağlanarak yazdırdık
        int sayi = topla(35, 7); // iki değişken atadık
        System.out.println(sayi); // ve yazdırdık
        int toplam = topla2(1, 2, 3, 4, 5, 6); // veriable arguments
        System.out.println(toplam);
    }

    public static void ekle() {  // diyelim ki bir müşteri girdi çıktı yapısını şu şekilde yapabiliriz
        System.out.println("Eklendi.");
    }

    public static void sil() { // ve void fonksiyonu hariç sayıyı da stringi de döndürebiliriz
        System.out.println("Silindi."); // sebebi voidi bir değişkene atamayız
    }

    public static void guncelle() {
        System.out.println("Güncellendi.");
    }

    public static int topla(int sayi1, int sayi2) { // toplama fonksiyonu yazdırdık
        return sayi1 + sayi2; // return burada döndürmek anlamına gelir sayıyı tutar ve döndürür
    }

    // Veriable Arguments birden fazla sayıyı toplamamıza veya farklı işlemler yapmamıza olanak sağlar.
    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() { // string fonksiyonu tanımladık
        return "Ankara"; // Ankara stringimizi yukarı kısma gönderecektir
    }


    // parametreli metodlar bu kadardı
}

