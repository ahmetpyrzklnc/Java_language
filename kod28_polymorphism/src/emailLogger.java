public class emailLogger extends BasedLogger {
    public void log(String message){
        System.out.println("Logged to email :" + message); //overriding

        // bilgi için databaseloggerı oku
    }
}
