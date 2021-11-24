package fa.trainning.main;

import fa.trainning.entities.Customer;
import fa.trainning.services.CustomerService;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.save(null);
//        List<String> customers = customerService.createCustomer();
//        customers.forEach(customer -> System.out.println(customer));
    }
}
