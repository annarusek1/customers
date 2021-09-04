package pl.sda.customers.zadania;


import org.springframework.stereotype.Component;

@Component
public class BeanA {

BeanB beanB;
public BeanA (BeanB beanB){
    this.beanB = beanB;
}
    public void bA(){
        System.out.println("I'm bean A!");
    }
}
