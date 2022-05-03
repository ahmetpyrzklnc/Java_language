public class CustomerManager{
    // burada ise hepsini aynı anda loglama yöntemi
    // bu şekilde yapılırsa daha kolay bir şekilde main blok üzerinden loglanır.

    private final BasedLogger logger;
    private BasedLogger basedLogger;

    public CustomerManager(BasedLogger logger){
       this.logger = logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi.");
        this.logger.log("log mesajı");

        // tek tek loglama yöntemi:

//        DatabaseLogger logger = new DatabaseLogger();
//        logger.log("log message");
    }
}
