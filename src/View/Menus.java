package View;

import Entities.Customer;
import Entities.Receipt;

import java.util.Scanner;

public class Menus {
    public static Scanner sc = new Scanner(System.in);

    public static Customer getCustomerInfo() {
        System.out.println("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.println("Nhập số nhà của khách hàng: ");
        int no = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mã số công tơ của khách hàng: ");
        String meterNumber = sc.nextLine();
        Customer customer = new Customer(name, no, meterNumber);
        return customer;
    }

    public static Receipt getReceiptInfo() {
        System.out.println("Nhập chỉ số điện cũ: ");
        int oldIndex = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chỉ số điện mới: ");
        int newIndex = Integer.parseInt(sc.nextLine());
        Receipt receipt = new Receipt(oldIndex, newIndex);
        return receipt;
    }
}
