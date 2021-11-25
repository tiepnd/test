package fa.trainning.main;

import fa.trainning.entities.Customer;
import fa.trainning.services.CustomerService;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        // List<String> customers = customerService.createCustomer();
        // customerService.save(customers);
        customerService.display(customerService.findAll());
        // customerService.display(customerService.search("01656250022"));
    }
}
