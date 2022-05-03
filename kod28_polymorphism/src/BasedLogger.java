public class BasedLogger {
    public void log(String message){
        System.out.println("Default logger : "+ message);

        // burası ana sınıftır diğer sınıflar buradan miras alarak yazdırır.
    }
}
