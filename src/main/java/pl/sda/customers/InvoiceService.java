package pl.sda.customers;

import org.springframework.stereotype.Component;

@Component
public class InvoiceService {

    public void createInvoice(){
        System.out.println("Invoice creating");
    }
}
