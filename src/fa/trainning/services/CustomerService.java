package fa.trainning.services;

import fa.trainning.entities.Customer;
import fa.trainning.entities.Order;
import fa.trainning.utils.Constants;
import fa.trainning.utils.Validator;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    // 1
    public List<String> createCustomer() {
        Scanner scanner = new Scanner(System.in);
        List<String> customers = new ArrayList<>();
        String name, phone, address;
        System.out.println("Enter Customer infomation");
        while (true) {
            List<Order> orders = new ArrayList<>();
            System.out.println("Enter name");
            name = scanner.nextLine();
            System.out.println("Enter phone number");
            while (true) {
                phone = scanner.nextLine();
                if (Validator.isPhoneNumber(phone)) {
                    break;
                } else {
                    System.out.println("Phone number is invalid, please retype!");
                }
            }
            System.out.println("Enter address");
            address = scanner.nextLine();
            System.out.println("Enter order list");
            while (true) {
                Order order = new OrderService().createOrder(scanner);
                orders.add(order);
                System.out.println("Continue enter order, Y/N?");
                if (Constants.NO.equalsIgnoreCase(scanner.nextLine())) {
                    break;
                }
            }
            customers.add(new Customer(name, phone, address, orders).toString());
            System.out.println("Continue enter customer, Y/N?");
            if (Constants.NO.equalsIgnoreCase(scanner.nextLine())) {
                break;
            }
        }
        scanner.close();
        return customers;
    }

    // 2
    public String save(List<String> customers) {
        Path dataFolderPath = Paths.get(Constants.DATA_FOLDER_PATH);
        Path customerFilePath = Paths.get(Constants.CUSTOMER_FILE_PATH);
        OutputStream outputStream = null;
        try {
            Files.createDirectories(dataFolderPath);
            if (!Files.exists(customerFilePath)) {
                Files.createFile(customerFilePath);
            }
            outputStream = new BufferedOutputStream(Files.newOutputStream(customerFilePath, StandardOpenOption.APPEND));
            for (String customer : customers) {
                outputStream.write((customer + Constants.NEW_LINE).getBytes());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
        return null;
    }

}
