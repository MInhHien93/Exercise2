package Entities;

public class Receipt {
    private Customer customer;
    private int oldIndex;
    private int newIndex;
    private double billTotal;

    public Receipt() {
    }

    public Receipt(int oldIndex, int newIndex) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public double getBillTotal() {
        billTotal = (newIndex - oldIndex) * 750;
        return billTotal;
    }

    public void setBillTotal(double billTotal) {
        this.billTotal = billTotal;
    }

    @Override
    public String toString() {
        return "Biên lai tiền điện: " + "\n" +
                customer.toString() +
                "Chỉ số cũ: " + oldIndex + "\n" +
                "Chỉ số mới: " + newIndex + "\n" +
                "Tổng số tiền phải trả là: " + billTotal + "đồng.\n";
    }
}
