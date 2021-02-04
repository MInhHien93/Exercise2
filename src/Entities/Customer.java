package Entities;

public class Customer {
    private String name;
    private int houseNumber;
    private String meterNumber;

    public Customer() {
    }

    public Customer(String name, int houseNumber, String meterNumber) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.meterNumber = meterNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
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
                "Số nhà: " + houseNumber + "\n" +
                "Mã số công tơ: " + meterNumber + "\n";
    }
}
