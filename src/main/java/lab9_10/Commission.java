package lab9_10;

public class Commission extends Hourly {
    private double total_sales;
    private final double commission_rate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission_rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commission_rate = commission_rate;
    }

    public void addSales(double sales) {
        total_sales += sales;
    }

    public double pay() {
        return super.pay() + (total_sales * commission_rate);
    }

    public String toString() {
        return super.toString() + "\nTotal Sales: " + total_sales + "\nCommission Rate: " + commission_rate;
    }

}
