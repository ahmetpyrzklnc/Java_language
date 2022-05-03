public class FileLogger extends BasedLogger {
    public void log(String message){
        System.out.println("Logged to file :" + message); //overriding

        // aynısı database, file, email de sınıflarının özelliği ortaktır.
        // bilgi için databaseloggerı oku
    }
}
