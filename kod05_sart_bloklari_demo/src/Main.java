public class Main {

    public static void main(String[] args) {
        // int sayi1;
        // sayi1 = 20; // bu şekilde de sayı tanımlaması yapabiliriz;

        int sayi1 = 30;
        int sayi2 = 25; // burada aslında temelinde 3 sayı tuttuk ve bu üçsayının en büyüğünü yazdıracağız
        int sayi3 = 2;
        int enBuyuk = sayi1; // burada istediğimiz değeri atabiliriz.;

        if (enBuyuk < sayi2) {  // burada sayi1 ile sayi 2'yi kıyasladık eğer sayi1 değeri büyükse;
            enBuyuk = sayi2; // buradaki kod satırlarını çalıştırmadan aşağı iner.;
        }
        // eğer ki sayi1 değeri sayi2'den küçükse enBuyuk değerini sayi1'den silip yerine sayi2 yazar
        // aşağıdaki kod satılarına geçer.


        if (enBuyuk < sayi3) {  // yukarıdaki bloktan gelen enBuyuk değerini sayi3'le kıyaslar.
            enBuyuk = sayi3;  // en sonunda değeri print satırına gönderir.
        }

        System.out.println("En büyük sayımız:" + enBuyuk); // buradaki en son değeri ekrana bastıracağız;


        // bu şekilde bir sayı kıyaslama programı yaptık.;
    }
}
