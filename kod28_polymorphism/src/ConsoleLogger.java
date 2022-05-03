public class ConsoleLogger extends BasedLogger {
    public void log(String message){
        System.out.println("Logged to console :" + message); //overriding -- üzerine yazdırma

        // console logger konsolda çalışıp çalışmadığını öğrenmemize olanak sağlar projede karşılığı yoktur

        // basedlogger'dan miras alır ve overriding yaptırır.
    }
}
