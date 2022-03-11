public class Main {

    public static void main(String[] args) {
        // while döngüsü;

        // While döngüleri for döngülerinden pek bir farkı yoktur;
        // for döngüleriyle yapabildiğimiz her şeyi while'da da yapabiliriz;
        // veya tam tersi de olabilir.;

        // Ama while döngüsünde dikkat etmemiz gereken bazı önemli noktalar vardır;
        // eğer ki bu noktalara dikkat etmezsek kodumuz sonsuz döngü dediğimiz olaya girebilir;

        // gelin örnek üzerinde deneyelim. Ama kodu çalıştırmayalım :) ;

        int i = 2; // öncelikle bir değişken tanımladık; 2'yle başlasın döngüye;
        while (i < 22) { // burada while ile 20'de de son bulacağı kodladık.;
            System.out.println(i); // ve bulduğu i sonuçlarını ekrana bastırsın;
            i += 2; // aman buraya dikkat edelim;
        }

        System.out.println("While döngüsü sona erdi.");


        // Eğer yukarıdaki kodu çalıştırırsak bize 2'den başlatarak 20'de dahil olmak üzere bütün çift sayıları;
        // ekrana bastıracaktır.

        // peki burada uyardığım satır ne işe yarıyor diye soracak olursanız;
        // burada o kod satırını silerseniz kod kısır döngüye girer arttıracak bir unsur olmadığı için;
        //sürekli olarak 1 değerini döndürecek ve bu şekilde ilerleyecek;

        // Lütfen onu silip çalıştırmayalım kullandığım İDE'ler sıkıntı çıkarabilir ;
        // bütün riski aldım çalıştırayım derseniz de denetim masası programlar üzerinden idenizin çalıştırmasını;
        // durdurun çünkü kod dur durak bilmeden bilgisayarınızın şarjı bitesiye kadar arka planda çalıştırır;

        // Kısaca while döngümüz bu kadardı.;

    }
}
