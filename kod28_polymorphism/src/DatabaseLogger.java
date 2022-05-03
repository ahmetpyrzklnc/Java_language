public class DatabaseLogger extends BasedLogger {
    public void log(String message){
        System.out.println("Logged to database :" + message); //overriding

        // istersek yukarıdaki kodları silebiliriz ama silmezsek bu overriding dediğimiz
        // yani üzerine yazma olayını gerçekleştirir.
    }
}
