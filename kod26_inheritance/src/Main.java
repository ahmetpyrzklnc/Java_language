public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
//    customer --- commandtan çıkar nokta koy geldiği görülür.
//    employee --- commandtan çıkar nokta koy geldiği görülür.


        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.bestEmployee(); // sınıfa özel obje getirildi
        employeeManager.Add(); // personManagerdan geldi.
        employeeManager.List(); // personManagerdan geldi.

        customerManager.Add(); // personManagerdan geldi.
        customerManager.List(); // personManagerdan geldi.
    }
}
