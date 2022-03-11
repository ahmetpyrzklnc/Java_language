public class Main {

    public static void main(String[] args) {
        // do-while döngüsü programlamada fazla kullanılmaz.;
        // ama öğrenmekte fayda var.;

        // do while döngüsü aslında bakacak olursak while döngüsünden pek fazla farkı yoktur.;
        // sadece tek bir farkı vardır. ;

        // bunu bir normal while döngüsü ve bide do-while döngüsü örnekleriyle kıyas ederek anlatacağım.;

        // normal bir while döngüsü;

        int i = 22;  // eğer ki buradaki değerimiz
        while (i < 20) {  // buradan büyükse döngüye hiç girmeden direkt alt satıra geçer;
            System.out.println(i);
            i += 2;
        }   // kodu çalıştırarak deneyelim;
        System.out.println("While döngüsü bitmiştir.");

        // şimdi ise bir do-while döngüsü kuralım;

        int j = 100; // öncelikle bir j değişkeni tanımlayalım;
        do {  // do anahtar kelimesiyle do while'ı çağırırız;
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do While döngüsü bitti...");

        // bu şekilde oluşturulur çıktı olarak öncelikle j değerini ekrana bastırır;
        //sonrasında döngüden çıkarak döngünün sonundaki println değerini ekrana bastırır;

        // çıktı;
        //   100
        //   Do While döngüsü bitti...

        // do while döngüsü bu kadardı peki bunu dediğimiz gibi pek fazla kullanmayız gerçek hayat senaryosu;
        // nedir diye soracak olursak;
        // diyelim ki bir veri tabanıyla çalışıyorsunuz ve bu veri tabanına bir long atmak istiyorsunuz;
        // işte o zaman bu döngüyü kurarak kısaca o veritabanına bu işi yaptığınıza dair kaydı düşürebilirsiniz;

        // döngülerimizin sonuna gelmiş bulunmaktayız.;


    }
}
