public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 4, 5, 6, 8}; // bir dizi tanımlatalım
        int bulunacakSayi = 15; // dizi içinde aranacak sayıları buraya yerleştirelim
        boolean varMi = false; // eğer olmayan sayı girilirse false olarak döndürecek

        for (int sayi : sayilar) {  // dizi üstünde for döngüsüyle geziniyoruz
            if (sayi == bulunacakSayi) { // eğer girilen sayı dizi içinde sayıya eşittse
                varMi = true; // true olarak döndürsün
            } // eğer yoksa da yukarıda false olarak girdiğimiz için false olarak kalacak
        }

        if (varMi) {
            System.out.println("Sayı mevcuttur..."); // sayı varsa bunu döndür
        } else {
            System.out.println("Sayı mevcut değildir..."); // yoksa da bunu döndür
        }


        // Bu şekilde dizimiz içindeki sayıyı aratarak olup olmadığını;
        // kontrol eden bir algoritma geliştirdik.
    }
}

