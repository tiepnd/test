package fa.trainning.entities;

import fa.trainning.utils.Constants;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private String number;
    private Date date;

    public Order() {
    }

    public Order(String number, Date date) {
        this.number = number;
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return number + "-" + new SimpleDateFormat(Constants.DATE_FORMAT).format(date);
    }
}
