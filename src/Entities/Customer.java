package Entities;

public class Customer {
    private String name;
    private int no;
    private String meterNumber;

    public Customer() {
    }

    public Customer(String name, int no, String meterNumber) {
        this.name = name;
        this.no = no;
        this.meterNumber = meterNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    @Override
    public String toString() {
        return "Tên khách hàng: " + name + "\n" +
                "Số nhà: " + no + "\n" +
                "Mã số công tơ: " + meterNumber + "\n";
    }
}
