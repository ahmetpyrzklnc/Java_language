public class personManager {
    public void List(){
        System.out.println("listelendi.");
    }

    public void Add() {
        System.out.println("eklendi.");
    }

    // PersonManager, EmployeeManager ve CustomerManager içinde bulunan ortak objeleri tek bir yere topladı
    // ve biz bunu extends ile  diğerlerine miras bıraktık.
    // yani diğer iki customerManager ve EmployeeManager buradan miras alacak.
}
