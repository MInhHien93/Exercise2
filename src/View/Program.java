package View;

import Controller.CustomerManagement;
import Controller.ReceiptManagement;

import java.util.Scanner;

public class Program {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ReceiptManagement rm = new ReceiptManagement();
        CustomerManagement cm = new CustomerManagement();
        StartMenu:
        do {
            System.out.println("Chương trình quản lý thu tiền điện theo hộ gia đình");
            System.out.println("1.Quản lý khách hàng");
            System.out.println("2.Quản lý biên lai");
            System.out.println("---------------------");
            System.out.println("Nhập lựa chọn: ");
            int choise = Integer.parseInt(sc.nextLine());
            if (choise == 1) {
                System.out.println("Quản lý khách hàng");
                System.out.println("1.Add");
                System.out.println("2.Update");
                System.out.println("3.Delete");
                System.out.println("4.Show");
                System.out.println("---------------------");
                System.out.println("Nhập lựa chọn: ");
                int choise1 = Integer.parseInt(sc.nextLine());
                switch (choise1) {
                    case 1:
                        System.out.println("Nhập thông tin cho n hộ dùng điện: ");
                        int numbers = Integer.parseInt(sc.nextLine());
                        cm.add(numbers);
                        break;
                    case 2:
                        System.out.println("Nhập tên khách hàng muốn cập nhật thông tin: ");
                        String updateInfo = sc.nextLine();
                        cm.update(updateInfo);
                        break;
                    case 3:
                        System.out.println("Nhập tên khách hàng muốn cập nhật thông tin: ");
                        String deleteInfo = sc.nextLine();
                        cm.delete(deleteInfo);
                        break;
                    case 4:
                        cm.showAll();
                        break;
                    default:
                        System.out.println("Quay lại!");
                        continue StartMenu;
                }
            } else {
                System.out.println("Quản lý biên lai");
                System.out.println("1.Add");
                System.out.println("2.Bill Total");
                System.out.println("3.Show");
                System.out.println("---------------------");
                System.out.println("Nhập lựa chọn: ");

            }
        } while (true);
    }
}
