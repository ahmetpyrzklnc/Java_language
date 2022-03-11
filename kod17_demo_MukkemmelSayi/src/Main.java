public class Main {

    public static void main(String[] args) {
        // Mükemmel sayılar kendisinin pozitif bölenlerin toplamı
        // o sayıyı veriyorsa biz o sayıya mükemmel sayı deriz örnek vermek gerekirse
        // 6 -- 1,2,3
        //28 --- 1,2,4,7,14 şeklinde örneklendirebiliriz...

        int number = 6;  // girilecek sayı değişkenini tanımladık
        int total = 0;  // ve bir toplam değşkeni atadık

        for (int i = 1; i < number; i++) {  // kısa bir for döngüsüyle sayıyı 1'den başlatarak bölmeye çalıştırıyoruz;
            // ve sayıyı bir arttırıyoruz
            if (number % i == 0) {  // eğer sayı tam bölünüyorsa
                total = total + i;  // toplam değişkenini i'yle topluyoruz
            }
        }

        if (total == number) {  // sonuç olarak toplam değişkeniyle sayı değişkeni eşitse
            System.out.println("Mükemmel Sayıdır...");  // ekrana bunu bastırıyoruz
        } else {  // değilse
            System.out.println("Mükemmel Sayı Değildir...");  // bunu bastırıyoruz
        }


        // bu şekilde mükemmel sayı bulduran bir algoritma geliştirmiş olduk..
    }
}
