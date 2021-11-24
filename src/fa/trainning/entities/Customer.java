package fa.trainning.entities;

import java.util.List;

public class Customer {
    private String name;
    private String phone;
    private String address;
    private List<Order> orders;

    public Customer() {
    }

    public Customer(String name, String phoneNumber, String address, List<Order> orders) {
        this.name = name;
        this.phone = phoneNumber;
        this.address = address;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return name + "-" + address + "-" + phone + "-" + orders;
    }

}
