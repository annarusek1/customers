package pl.sda.customers.zadania;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeanATest {

    @Autowired
    private BeanA beanA;

    @Test
    void testbA(){
        beanA.bA();
    }

}