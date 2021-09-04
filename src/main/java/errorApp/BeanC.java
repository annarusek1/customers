package errorApp;


import errorApp.BeanA;
import org.springframework.stereotype.Component;

@Component
public class BeanC {
BeanA beanA;

public BeanC (BeanA beanA){
    this.beanA = beanA;
}
    public void bC (){
        System.out.println("I'm bean C!");
    }
}
