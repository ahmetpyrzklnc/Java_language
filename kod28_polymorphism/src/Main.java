public class Main {

    public static void main(String[] args) {
	// loglama yöntemi

        // tek tek sınıf sınıf çağırıp loglama yöntemi
//       emailLogger logger = new emailLogger();
//       logger.log("log message");


        // burada ise bir array üzerinden loglama yöntemi

//       BasedLogger[] loggers = new BasedLogger[]{new emailLogger(), new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
//       for(BasedLogger logger : loggers){
//           logger.log("log mesajı");
//       }

        // customer manager özelliklerini ekrana yazdırma

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
