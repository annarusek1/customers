package pl.sda.customers.zadania;


import org.springframework.stereotype.Component;

@Component
public class BeanB {
BeanC beanC;
public BeanB (BeanC beanC){
    this.beanC = beanC;
}
    public void bB(){
        System.out.println("I'm bean B!");
    }
}
