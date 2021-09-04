package pl.sda.customers;

import org.springframework.stereotype.Component;

@Component
public class OrderRepository {

   public void save (){
       System.out.println("saving");
    }
}
