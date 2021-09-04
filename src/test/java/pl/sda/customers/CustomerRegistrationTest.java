package pl.sda.customers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerRegistrationTest {
//Autowired pozwala na wstrzyknięcie beanów springowych
//    do testów i możemy go używać


    @Autowired
    private CustomerRegistration customerRegistration;

    @Test
    void testRegisterCustomer(){
        customerRegistration.register("anna@wp.pl", "Jan Kowalski");
    }

        /*
         * druga opcja (niezalecana):
         * @Autowired
         * private CustomerRepository repository;
         * */
    /*Trzeci sposób (setter)
    @Autowired
    * public void setRepository (CustomerRepository repository){
    * this.repository = repository;
    - też nie rekomendowana */
}