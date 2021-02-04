package Controller;

import Entities.Customer;
import View.Menus;

import java.util.ArrayList;
import java.util.List;

public class CustomerManagement {
    public static  List<Customer> customers = new ArrayList<>();

    public void add(int numbers) {
        Customer customer;
        for (int i = 0; i < numbers; i++) {
            customer = Menus.getCustomerInfo();
            customers.add(customer);
            System.out.println(customer.toString());
        }
    }

    public void update (String name) {
        for (Customer c:customers) {
            if (c.getName().equals(name)) {
                c = Menus.getCustomerInfo();
            }
            System.out.println(c.toString());
        }
    }

    public void delete (String name) {
        boolean isDelete = false;
        for (Customer c:customers) {
            if (c.getName().equals(name)) {
                isDelete = customers.remove(c);
            }
            System.out.println(isDelete);
        }
    }

    public void showAll () {
        for (Customer c:customers) {
            System.out.println(c.toString());
        }
    }
}
