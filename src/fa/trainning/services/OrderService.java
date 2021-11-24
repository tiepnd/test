package fa.trainning.services;

import fa.trainning.entities.Order;
import fa.trainning.utils.Constants;
import fa.trainning.utils.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OrderService {
    public Order createOrder() {
        Scanner scanner = new Scanner(System.in);
        String number;
        Date date;
        System.out.println("Enter number order with length equal 10");
        while (true) {
            number = scanner.nextLine();
            if (Validator.isValidLengthNumberOrder(number)) {
                break;
            } else {
                System.out.println("Length of order number is invalid, please retype length equal 10!");
            }
        }
        System.out.println("Enter date with format " + Constants.DATE_FORMAT);
        while (true) {
            String dateStr = scanner.nextLine();
            date = stringToDate(dateStr);
            if (date != null) {
                break;
            } else {
                System.out.println("Please retype!");
            }
        }
        return new Order(number, date);
    }

    private Date stringToDate(String dateStr) {
        if (!dateStr.matches(Constants.DATE_REGEX)) {
            System.out.println("Date is wrong format, please retype format is " + Constants.DATE_FORMAT);
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.DATE_FORMAT);
        try {
            return simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Date is invalid");
            return null;
        }
    }
}
