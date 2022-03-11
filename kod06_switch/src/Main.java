public class Main {

    public static void main(String[] args) {
        char grade = 'A'; // bir char tanımladık.

        // switchler pek fazla kullanılmaz ama bu hiç kullanılmadığı anlamına gelmez.;
        // switch genel olarak bir dizin halinde bizim şart bloklarımızı oluşturmamıza yarayan bir araçtır.;

        switch (grade) {
            case 'A':  // case bizim harf notumuzu yukarıdaki grade alarak kıyas yapmamıza olanak sağlar;
                System.out.println("Mükemmel!, Geçtiniz!");
                break; // döngüyü kırmamız gerekir...
            case 'B':
                System.out.println("Harika!, Geçtiniz!");
                break;
            case 'C':
                System.out.println("İyi!, Geçtiniz!"); // diyelim ki iki farklı notun aynı şey yazmasını istiyorsunuz;
                break; // o zaman bu 2 satırı silerek case c ve d'yi alt alta getirin aynı sonucu alacaksınızdır.
            case 'D':
                System.out.println("Fena Değil!, Geçtiniz!");
                break;
            case 'F':
                System.out.println("Maalesef!, Kaldınız!");
                break;
            default: // default ise geçersiz karakter girildiğinde kullanıcıyı uyaracak yapıda bir terimdir.
                System.out.println("Geçersiz not girdiniz!");

                // kullanıcı yanlışlıkla tanımlanmamış harf notu girdiğini varsayarsak default kısmı çalışarak;
                // kullanıcıyı uyarıcaktır.

                // Switch'le birlikte karar yapılarının sonuna geldik.;

        }
    }
}
