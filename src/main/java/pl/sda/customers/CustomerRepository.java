package pl.sda.customers;

import org.springframework.stereotype.Component;
//Aby użyć tej klasy w Springu należy go otagować jako
//komponent (bean springowy)
@Component
public class CustomerRepository {

    public void save(String email, String name){
        System.out.println("Saving to database " + email);
    }

}
