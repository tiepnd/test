package fa.trainning.main;

import fa.trainning.entities.Customer;
import fa.trainning.services.CustomerService;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        // List<String> customers = customerService.createCustomer();
        // customers.forEach(customer -> System.out.println(customer));
        customerService.save(Arrays.asList("tiepnd-NB-01656250022-[1234567890-15/06/1998, 1234567891-01/01/2021]",
                "dungnnt-BN-0356250022-[1234567982-27/09/1998]"));
    }
}
