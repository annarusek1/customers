package pl.sda.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
InvoiceService invoiceService = new InvoiceService();
OrderRepository orderRepository = new OrderRepository();

    public OrderService(InvoiceService invoiceService, OrderRepository orderRepository) {
        this.invoiceService = invoiceService;
        this.orderRepository = orderRepository;
    }

    void makeOrder(){
        System.out.println("making order");
        invoiceService.createInvoice();
        orderRepository.save();
        System.out.println("Order crated");
    }
}
