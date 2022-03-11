public class Main {

    public static void main(String[] args) {
        int sayi = 75; // ilk sayımızı girelim
        int kalan = sayi % 2;  // sayımızın modunu alalım mod bölme demektir.
        // System.out.println(kalan); // istersek bölümünden kalanı bastırabiliriz
        boolean isPrime = true; // isprime asal demektir. burada öncelikle sayımızı true olarak girmemiz gerekir.

        if (sayi == 1) { // 1 sayısı asal olmadığı için sistem bugını düzeltelim ve
            System.out.print("Sayı asal değil..."); // kodumuzu düzeltelim.
            isPrime = false; // burada asal olmadığını belirttik
            return; // return yapmamızın sebebi eğer bunu koymazsak aşağıdaki döngüyü de çalıştırır.
        }

        if (sayi < 1) { // eksili ifadelerde bize uyarı gönderir
            System.out.println("Geçersiz sayı..."); // ekranda belirttik
            isPrime = false; // yine asal olmadığını belirttik
            return; // yukarıdaki kodla aynı işleve sahiptir
        }

        for (int i = 2; i < sayi; i++) { // sayımızı 2'den başlatır 1 arttırarak
            if (sayi % i == 0) { // modunu alır eğer bölümünden kalan sıfırsa
                isPrime = false; // sayımız asal değildir
            }

        }
        if (isPrime) {  // burada en son sonucu ekranımıza bastırır.
            System.out.println("Sayı Asaldır..."); // Asalsa bunu
        } else {
            System.out.print("Sayı Asal Değildir!..."); // değilse bunu ekrana döndürür
        }

        // Asal sayı demomuz bu kadardı...

    }
}
